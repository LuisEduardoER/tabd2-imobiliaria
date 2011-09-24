/*
 * An XML document type.
 * Localname: ImovelList
 * Namespace: http://uniriotec.br/TABD2/Imovel
 * Java type: br.uniriotec.tabd2.imovel.ImovelListDocument
 *
 * Automatically generated - do not modify.
 */
package br.uniriotec.tabd2.imovel.impl;
/**
 * A document containing one ImovelList(@http://uniriotec.br/TABD2/Imovel) element.
 *
 * This is a complex type.
 */
public class ImovelListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.uniriotec.tabd2.imovel.ImovelListDocument
{
    
    public ImovelListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMOVELLIST$0 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "ImovelList");
    
    
    /**
     * Gets the "ImovelList" element
     */
    public br.uniriotec.tabd2.imovel.LstImovel getImovelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.LstImovel target = null;
            target = (br.uniriotec.tabd2.imovel.LstImovel)get_store().find_element_user(IMOVELLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImovelList" element
     */
    public void setImovelList(br.uniriotec.tabd2.imovel.LstImovel imovelList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.LstImovel target = null;
            target = (br.uniriotec.tabd2.imovel.LstImovel)get_store().find_element_user(IMOVELLIST$0, 0);
            if (target == null)
            {
                target = (br.uniriotec.tabd2.imovel.LstImovel)get_store().add_element_user(IMOVELLIST$0);
            }
            target.set(imovelList);
        }
    }
    
    /**
     * Appends and returns a new empty "ImovelList" element
     */
    public br.uniriotec.tabd2.imovel.LstImovel addNewImovelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.LstImovel target = null;
            target = (br.uniriotec.tabd2.imovel.LstImovel)get_store().add_element_user(IMOVELLIST$0);
            return target;
        }
    }
}
