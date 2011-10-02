/**
 * Generated from schema type t|e=sol|t=Imovel@http://uniriotec.br/TABD2/Imovel
 */
package br.uniriotec.tabd2.imovel;

import java.util.HashMap;
import java.util.Map;
import org.apache.xmlbeans.impl.util.XsTypeConverter;



public class Sol implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected Sol(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _m = "M";

  public static final java.lang.String _t = "T";

  public static final java.lang.String _mt = "MT";

  public static final Sol m = new Sol(_m);

  public static final Sol t = new Sol(_t);

  public static final Sol mt = new Sol(_mt);

  public java.lang.String getValue() {
    return this.value;
  }

  public static Sol fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (Sol) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static Sol fromString(String value) {
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
    if (!(obj instanceof Sol)) return false;
    final Sol x = (Sol) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_m, m);
    map.put(_t, t);
    map.put(_mt, mt);
  }

}
