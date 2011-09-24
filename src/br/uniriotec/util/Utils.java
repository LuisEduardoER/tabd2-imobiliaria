package br.uniriotec.util;

import java.lang.reflect.Method;

public class Utils {
	/** Verifica se uma string é nula e levanta uma exceção caso seja.
	  * <p>
	   * Uma das verificações que todo serviço deve fazer é se os parâmetros de
	   * entrada são válidos. Este método verifica se a string passada como
	   * parâmetro é nula. Caso seja nula, ele levanta uma exceção.
	   * <p>
	   * 
	   * @param str string que se deseja verificar.
	   * @param parameterName o nome do parâmetro do serviço, para a composição da
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
	   * Automatiza a construção do XMLBeans a partir de um POJO.
	   * <p>
	   * É necessário transformar o POJO retornado pelo dbControl no XMLBean a ser
	   * enviado para o cliente pelo serviço. Este método automatiza esta tarefa
	   * dado que o POJO e o XML possuam métodos com o mesmo nome e assinaturas
	   * iguais, só variando o prefixo get e o set de cada um, respectivamente.
	   * Portanto, é importante que o POJO e o XMLBean possuam os atributos com o
	   * mesmo nome e tipo.
	   * <p>
	   * 
	   * @param pojo pojo retornado pelo dbControl.
	   * @param xml XMLBean que será enviado ao cliente.
	   * 
	   * @throws Exception caso o acesso a algum método seja inválido.
	   */
	  public static void parsePOJO2XML(Object pojo, Object xml) throws Exception {
	    if (pojo == null) {
	      throw new IllegalArgumentException("pojo == null");
	    }
	    if (xml == null) {
	      throw new IllegalArgumentException("xml == null");
	    }
	    // Referências feitas fora do loop para otimizar chamadas.
	    Class pojoClass = pojo.getClass();
	    Class xmlClass = xml.getClass();

	    Method[] methods = pojoClass.getMethods();
	    for (Method m : methods) {
	      String methodName = m.getName();
	      // Trata apenas métodos get que pertencem as classes definidas no
	      // namespace da BR.
	      if (methodName.startsWith("get")
	        && m.getDeclaringClass().getName().contains("uniriotec")) {
	        // Obtém o método get do atributo da classe "pojo".
	        Method mget = pojoClass.getMethod(methodName, new Class[] {});
	        // Obtém o método set do atributo respectivo na classe xml.
	        methodName = "s" + methodName.substring(1);
	        Method mset = xmlClass.getMethod(methodName, mget.getReturnType());
	        // Obtém o atributo efetivamente retornado.
	        Object getted = mget.invoke(pojo, new Object[] {});
	        // Se o objeto não for nulo, atualiza o objeto xml.
	        if (getted != null) {
	          mset.invoke(xml, new Object[] { getted });
	        }
	      }
	    }
	  }

}
