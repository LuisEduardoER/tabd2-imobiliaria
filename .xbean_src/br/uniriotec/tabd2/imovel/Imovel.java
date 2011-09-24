/*
 * XML Type:  Imovel
 * Namespace: http://uniriotec.br/TABD2/Imovel
 * Java type: br.uniriotec.tabd2.imovel.Imovel
 *
 * Automatically generated - do not modify.
 */
package br.uniriotec.tabd2.imovel;


/**
 * An XML Imovel(@http://uniriotec.br/TABD2/Imovel).
 *
 * This is a complex type.
 */
public interface Imovel extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Imovel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.TABD2_IMOBILIARIATypeSystem").resolveHandle("imovel3d6ctype");
    
    /**
     * Gets the "id" element
     */
    int getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlInt xgetId();
    
    /**
     * Sets the "id" element
     */
    void setId(int id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlInt id);
    
    /**
     * Gets the "endereco" element
     */
    java.lang.String getEndereco();
    
    /**
     * Gets (as xml) the "endereco" element
     */
    org.apache.xmlbeans.XmlString xgetEndereco();
    
    /**
     * Sets the "endereco" element
     */
    void setEndereco(java.lang.String endereco);
    
    /**
     * Sets (as xml) the "endereco" element
     */
    void xsetEndereco(org.apache.xmlbeans.XmlString endereco);
    
    /**
     * Gets the "preco" element
     */
    java.math.BigDecimal getPreco();
    
    /**
     * Gets (as xml) the "preco" element
     */
    org.apache.xmlbeans.XmlDecimal xgetPreco();
    
    /**
     * Sets the "preco" element
     */
    void setPreco(java.math.BigDecimal preco);
    
    /**
     * Sets (as xml) the "preco" element
     */
    void xsetPreco(org.apache.xmlbeans.XmlDecimal preco);
    
    /**
     * Gets the "quartos" element
     */
    int getQuartos();
    
    /**
     * Gets (as xml) the "quartos" element
     */
    org.apache.xmlbeans.XmlInt xgetQuartos();
    
    /**
     * Sets the "quartos" element
     */
    void setQuartos(int quartos);
    
    /**
     * Sets (as xml) the "quartos" element
     */
    void xsetQuartos(org.apache.xmlbeans.XmlInt quartos);
    
    /**
     * Gets the "possui_vaga" element
     */
    br.uniriotec.tabd2.imovel.Imovel.PossuiVaga.Enum getPossuiVaga();
    
    /**
     * Gets (as xml) the "possui_vaga" element
     */
    br.uniriotec.tabd2.imovel.Imovel.PossuiVaga xgetPossuiVaga();
    
    /**
     * Sets the "possui_vaga" element
     */
    void setPossuiVaga(br.uniriotec.tabd2.imovel.Imovel.PossuiVaga.Enum possuiVaga);
    
    /**
     * Sets (as xml) the "possui_vaga" element
     */
    void xsetPossuiVaga(br.uniriotec.tabd2.imovel.Imovel.PossuiVaga possuiVaga);
    
    /**
     * Gets the "sol" element
     */
    br.uniriotec.tabd2.imovel.Imovel.Sol.Enum getSol();
    
    /**
     * Gets (as xml) the "sol" element
     */
    br.uniriotec.tabd2.imovel.Imovel.Sol xgetSol();
    
    /**
     * Sets the "sol" element
     */
    void setSol(br.uniriotec.tabd2.imovel.Imovel.Sol.Enum sol);
    
    /**
     * Sets (as xml) the "sol" element
     */
    void xsetSol(br.uniriotec.tabd2.imovel.Imovel.Sol sol);
    
    /**
     * An XML possui_vaga(@http://uniriotec.br/TABD2/Imovel).
     *
     * This is an atomic type that is a restriction of br.uniriotec.tabd2.imovel.Imovel$PossuiVaga.
     */
    public interface PossuiVaga extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PossuiVaga.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.TABD2_IMOBILIARIATypeSystem").resolveHandle("possuivaga03a9elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum S = Enum.forString("S");
        static final Enum N = Enum.forString("N");
        
        static final int INT_S = Enum.INT_S;
        static final int INT_N = Enum.INT_N;
        
        /**
         * Enumeration value class for br.uniriotec.tabd2.imovel.Imovel$PossuiVaga.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_S
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_S = 1;
            static final int INT_N = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("S", INT_S),
                    new Enum("N", INT_N),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.uniriotec.tabd2.imovel.Imovel.PossuiVaga newValue(java.lang.Object obj) {
              return (br.uniriotec.tabd2.imovel.Imovel.PossuiVaga) type.newValue( obj ); }
            
            public static br.uniriotec.tabd2.imovel.Imovel.PossuiVaga newInstance() {
              return (br.uniriotec.tabd2.imovel.Imovel.PossuiVaga) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.uniriotec.tabd2.imovel.Imovel.PossuiVaga newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.uniriotec.tabd2.imovel.Imovel.PossuiVaga) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML sol(@http://uniriotec.br/TABD2/Imovel).
     *
     * This is an atomic type that is a restriction of br.uniriotec.tabd2.imovel.Imovel$Sol.
     */
    public interface Sol extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.TABD2_IMOBILIARIATypeSystem").resolveHandle("sold068elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum M = Enum.forString("M");
        static final Enum T = Enum.forString("T");
        static final Enum MT = Enum.forString("MT");
        
        static final int INT_M = Enum.INT_M;
        static final int INT_T = Enum.INT_T;
        static final int INT_MT = Enum.INT_MT;
        
        /**
         * Enumeration value class for br.uniriotec.tabd2.imovel.Imovel$Sol.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_M
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_M = 1;
            static final int INT_T = 2;
            static final int INT_MT = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("M", INT_M),
                    new Enum("T", INT_T),
                    new Enum("MT", INT_MT),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.uniriotec.tabd2.imovel.Imovel.Sol newValue(java.lang.Object obj) {
              return (br.uniriotec.tabd2.imovel.Imovel.Sol) type.newValue( obj ); }
            
            public static br.uniriotec.tabd2.imovel.Imovel.Sol newInstance() {
              return (br.uniriotec.tabd2.imovel.Imovel.Sol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.uniriotec.tabd2.imovel.Imovel.Sol newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.uniriotec.tabd2.imovel.Imovel.Sol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.uniriotec.tabd2.imovel.Imovel newInstance() {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.uniriotec.tabd2.imovel.Imovel parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.uniriotec.tabd2.imovel.Imovel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.uniriotec.tabd2.imovel.Imovel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.uniriotec.tabd2.imovel.Imovel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
