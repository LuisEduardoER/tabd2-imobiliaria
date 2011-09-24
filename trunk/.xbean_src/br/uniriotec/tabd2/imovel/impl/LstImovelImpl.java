/*
 * XML Type:  lstImovel
 * Namespace: http://uniriotec.br/TABD2/Imovel
 * Java type: br.uniriotec.tabd2.imovel.LstImovel
 *
 * Automatically generated - do not modify.
 */
package br.uniriotec.tabd2.imovel.impl;
/**
 * An XML lstImovel(@http://uniriotec.br/TABD2/Imovel).
 *
 * This is a complex type.
 */
public class LstImovelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.uniriotec.tabd2.imovel.LstImovel
{
    
    public LstImovelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMOVEL$0 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "Imovel");
    
    
    /**
     * Gets a List of "Imovel" elements
     */
    public java.util.List<br.uniriotec.tabd2.imovel.Imovel> getImovelList()
    {
        final class ImovelList extends java.util.AbstractList<br.uniriotec.tabd2.imovel.Imovel>
        {
            public br.uniriotec.tabd2.imovel.Imovel get(int i)
                { return LstImovelImpl.this.getImovelArray(i); }
            
            public br.uniriotec.tabd2.imovel.Imovel set(int i, br.uniriotec.tabd2.imovel.Imovel o)
            {
                br.uniriotec.tabd2.imovel.Imovel old = LstImovelImpl.this.getImovelArray(i);
                LstImovelImpl.this.setImovelArray(i, o);
                return old;
            }
            
            public void add(int i, br.uniriotec.tabd2.imovel.Imovel o)
                { LstImovelImpl.this.insertNewImovel(i).set(o); }
            
            public br.uniriotec.tabd2.imovel.Imovel remove(int i)
            {
                br.uniriotec.tabd2.imovel.Imovel old = LstImovelImpl.this.getImovelArray(i);
                LstImovelImpl.this.removeImovel(i);
                return old;
            }
            
            public int size()
                { return LstImovelImpl.this.sizeOfImovelArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ImovelList();
        }
    }
    
    /**
     * Gets array of all "Imovel" elements
     */
    public br.uniriotec.tabd2.imovel.Imovel[] getImovelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMOVEL$0, targetList);
            br.uniriotec.tabd2.imovel.Imovel[] result = new br.uniriotec.tabd2.imovel.Imovel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Imovel" element
     */
    public br.uniriotec.tabd2.imovel.Imovel getImovelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel)get_store().find_element_user(IMOVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Imovel" element
     */
    public int sizeOfImovelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMOVEL$0);
        }
    }
    
    /**
     * Sets array of all "Imovel" element
     */
    public void setImovelArray(br.uniriotec.tabd2.imovel.Imovel[] imovelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(imovelArray, IMOVEL$0);
        }
    }
    
    /**
     * Sets ith "Imovel" element
     */
    public void setImovelArray(int i, br.uniriotec.tabd2.imovel.Imovel imovel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel)get_store().find_element_user(IMOVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(imovel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Imovel" element
     */
    public br.uniriotec.tabd2.imovel.Imovel insertNewImovel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel)get_store().insert_element_user(IMOVEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Imovel" element
     */
    public br.uniriotec.tabd2.imovel.Imovel addNewImovel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel)get_store().add_element_user(IMOVEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Imovel" element
     */
    public void removeImovel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMOVEL$0, i);
        }
    }
}
