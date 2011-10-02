/**
 * Generated from schema type t|e=possui_vaga|t=Imovel@http://uniriotec.br/TABD2/Imovel
 */
package br.uniriotec.tabd2.imovel;

import java.util.HashMap;
import java.util.Map;
//import com.bea.xbean.util.XsTypeConverter;
import org.apache.xmlbeans.impl.util.XsTypeConverter;

public class Possui_Vaga implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected Possui_Vaga(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _s = "S";

  public static final java.lang.String _n = "N";

  public static final Possui_Vaga s = new Possui_Vaga(_s);

  public static final Possui_Vaga n = new Possui_Vaga(_n);

  public java.lang.String getValue() {
    return this.value;
  }

  public static Possui_Vaga fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (Possui_Vaga) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static Possui_Vaga fromString(String value) {
    return fromValue(value);
  }

  public String toXML() {
    return XsTypeConverter.printString(this.value).toString();
  }

  public String toString() {
    return String.valueOf(value);
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Possui_Vaga)) return false;
    final Possui_Vaga x = (Possui_Vaga) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_s, s);
    map.put(_n, n);
  }

}
