/*
 * XML Type:  lstImovel
 * Namespace: http://uniriotec.br/TABD2/Imovel
 * Java type: br.uniriotec.tabd2.imovel.LstImovel
 *
 * Automatically generated - do not modify.
 */
package br.uniriotec.tabd2.imovel;


/**
 * An XML lstImovel(@http://uniriotec.br/TABD2/Imovel).
 *
 * This is a complex type.
 */
public interface LstImovel extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LstImovel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.TABD2_IMOBILIARIATypeSystem").resolveHandle("lstimovel92b1type");
    
    /**
     * Gets a List of "Imovel" elements
     */
    java.util.List<br.uniriotec.tabd2.imovel.Imovel> getImovelList();
    
    /**
     * Gets array of all "Imovel" elements
     * @deprecated
     */
    br.uniriotec.tabd2.imovel.Imovel[] getImovelArray();
    
    /**
     * Gets ith "Imovel" element
     */
    br.uniriotec.tabd2.imovel.Imovel getImovelArray(int i);
    
    /**
     * Returns number of "Imovel" element
     */
    int sizeOfImovelArray();
    
    /**
     * Sets array of all "Imovel" element
     */
    void setImovelArray(br.uniriotec.tabd2.imovel.Imovel[] imovelArray);
    
    /**
     * Sets ith "Imovel" element
     */
    void setImovelArray(int i, br.uniriotec.tabd2.imovel.Imovel imovel);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Imovel" element
     */
    br.uniriotec.tabd2.imovel.Imovel insertNewImovel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Imovel" element
     */
    br.uniriotec.tabd2.imovel.Imovel addNewImovel();
    
    /**
     * Removes the ith "Imovel" element
     */
    void removeImovel(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.uniriotec.tabd2.imovel.LstImovel newInstance() {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.LstImovel parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.uniriotec.tabd2.imovel.LstImovel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.uniriotec.tabd2.imovel.LstImovel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.uniriotec.tabd2.imovel.LstImovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
