package br.uniriotec.util;

import java.lang.reflect.Method;

public class Utils {
	/** Verifica se uma string � nula e levanta uma exce��o caso seja.
	  * <p>
	   * Uma das verifica��es que todo servi�o deve fazer � se os par�metros de
	   * entrada s�o v�lidos. Este m�todo verifica se a string passada como
	   * par�metro � nula. Caso seja nula, ele levanta uma exce��o.
	   * <p>
	   * 
	   * @param str string que se deseja verificar.
	   * @param parameterName o nome do par�metro do servi�o, para a composi��o da
	   *        mensagem de erro.
	   * @throws IllegalArgumentException caso a string seja nula.
	   */
	  public static void verificarStringNull(String str, String parameterName)
	    throws IllegalArgumentException {
	    if (str == null || str.trim().length() == 0)
	      throw new IllegalArgumentException("Parameter " + parameterName
	        + " is required.");
	  }

	  /**
	   * Automatiza a constru��o do XMLBeans a partir de um POJO.
	   * <p>
	   * � necess�rio transformar o POJO retornado pelo dbControl no XMLBean a ser
	   * enviado para o cliente pelo servi�o. Este m�todo automatiza esta tarefa
	   * dado que o POJO e o XML possuam m�todos com o mesmo nome e assinaturas
	   * iguais, s� variando o prefixo get e o set de cada um, respectivamente.
	   * Portanto, � importante que o POJO e o XMLBean possuam os atributos com o
	   * mesmo nome e tipo.
	   * <p>
	   * 
	   * @param pojo pojo retornado pelo dbControl.
	   * @param xml XMLBean que ser� enviado ao cliente.
	   * 
	   * @throws Exception caso o acesso a algum m�todo seja inv�lido.
	   */
	  public static void parsePOJO2XML(Object pojo, Object xml) throws Exception {
	    if (pojo == null) {
	      throw new IllegalArgumentException("pojo == null");
	    }
	    if (xml == null) {
	      throw new IllegalArgumentException("xml == null");
	    }
	    // Refer�ncias feitas fora do loop para otimizar chamadas.
	    Class pojoClass = pojo.getClass();
	    Class xmlClass = xml.getClass();

	    Method[] methods = pojoClass.getMethods();
	    for (Method m : methods) {
	      String methodName = m.getName();
	      // Trata apenas m�todos get que pertencem as classes definidas no
	      // namespace da BR.
	      if (methodName.startsWith("get")
	        && m.getDeclaringClass().getName().contains("uniriotec")) {
	        // Obt�m o m�todo get do atributo da classe "pojo".
	        Method mget = pojoClass.getMethod(methodName, new Class[] {});
	        // Obt�m o m�todo set do atributo respectivo na classe xml.
	        methodName = "s" + methodName.substring(1);
	        Method mset = xmlClass.getMethod(methodName, mget.getReturnType());
	        // Obt�m o atributo efetivamente retornado.
	        Object getted = mget.invoke(pojo, new Object[] {});
	        // Se o objeto n�o for nulo, atualiza o objeto xml.
	        if (getted != null) {
	          mset.invoke(xml, new Object[] { getted });
	        }
	      }
	    }
	  }

}
