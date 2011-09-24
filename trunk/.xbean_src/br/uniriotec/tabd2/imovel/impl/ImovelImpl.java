/*
 * XML Type:  Imovel
 * Namespace: http://uniriotec.br/TABD2/Imovel
 * Java type: br.uniriotec.tabd2.imovel.Imovel
 *
 * Automatically generated - do not modify.
 */
package br.uniriotec.tabd2.imovel.impl;
/**
 * An XML Imovel(@http://uniriotec.br/TABD2/Imovel).
 *
 * This is a complex type.
 */
public class ImovelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.uniriotec.tabd2.imovel.Imovel
{
    
    public ImovelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "id");
    private static final javax.xml.namespace.QName ENDERECO$2 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "endereco");
    private static final javax.xml.namespace.QName PRECO$4 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "preco");
    private static final javax.xml.namespace.QName QUARTOS$6 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "quartos");
    private static final javax.xml.namespace.QName POSSUIVAGA$8 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "possui_vaga");
    private static final javax.xml.namespace.QName SOL$10 = 
        new javax.xml.namespace.QName("http://uniriotec.br/TABD2/Imovel", "sol");
    
    
    /**
     * Gets the "id" element
     */
    public int getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "endereco" element
     */
    public java.lang.String getEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDERECO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endereco" element
     */
    public org.apache.xmlbeans.XmlString xgetEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDERECO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endereco" element
     */
    public void setEndereco(java.lang.String endereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDERECO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDERECO$2);
            }
            target.setStringValue(endereco);
        }
    }
    
    /**
     * Sets (as xml) the "endereco" element
     */
    public void xsetEndereco(org.apache.xmlbeans.XmlString endereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDERECO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDERECO$2);
            }
            target.set(endereco);
        }
    }
    
    /**
     * Gets the "preco" element
     */
    public java.math.BigDecimal getPreco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "preco" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPreco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRECO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "preco" element
     */
    public void setPreco(java.math.BigDecimal preco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECO$4);
            }
            target.setBigDecimalValue(preco);
        }
    }
    
    /**
     * Sets (as xml) the "preco" element
     */
    public void xsetPreco(org.apache.xmlbeans.XmlDecimal preco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRECO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRECO$4);
            }
            target.set(preco);
        }
    }
    
    /**
     * Gets the "quartos" element
     */
    public int getQuartos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUARTOS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "quartos" element
     */
    public org.apache.xmlbeans.XmlInt xgetQuartos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUARTOS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "quartos" element
     */
    public void setQuartos(int quartos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUARTOS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUARTOS$6);
            }
            target.setIntValue(quartos);
        }
    }
    
    /**
     * Sets (as xml) the "quartos" element
     */
    public void xsetQuartos(org.apache.xmlbeans.XmlInt quartos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUARTOS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUARTOS$6);
            }
            target.set(quartos);
        }
    }
    
    /**
     * Gets the "possui_vaga" element
     */
    public br.uniriotec.tabd2.imovel.Imovel.PossuiVaga.Enum getPossuiVaga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSSUIVAGA$8, 0);
            if (target == null)
            {
                return null;
            }
            return (br.uniriotec.tabd2.imovel.Imovel.PossuiVaga.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "possui_vaga" element
     */
    public br.uniriotec.tabd2.imovel.Imovel.PossuiVaga xgetPossuiVaga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel.PossuiVaga target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel.PossuiVaga)get_store().find_element_user(POSSUIVAGA$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "possui_vaga" element
     */
    public void setPossuiVaga(br.uniriotec.tabd2.imovel.Imovel.PossuiVaga.Enum possuiVaga)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSSUIVAGA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSSUIVAGA$8);
            }
            target.setEnumValue(possuiVaga);
        }
    }
    
    /**
     * Sets (as xml) the "possui_vaga" element
     */
    public void xsetPossuiVaga(br.uniriotec.tabd2.imovel.Imovel.PossuiVaga possuiVaga)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel.PossuiVaga target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel.PossuiVaga)get_store().find_element_user(POSSUIVAGA$8, 0);
            if (target == null)
            {
                target = (br.uniriotec.tabd2.imovel.Imovel.PossuiVaga)get_store().add_element_user(POSSUIVAGA$8);
            }
            target.set(possuiVaga);
        }
    }
    
    /**
     * Gets the "sol" element
     */
    public br.uniriotec.tabd2.imovel.Imovel.Sol.Enum getSol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOL$10, 0);
            if (target == null)
            {
                return null;
            }
            return (br.uniriotec.tabd2.imovel.Imovel.Sol.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sol" element
     */
    public br.uniriotec.tabd2.imovel.Imovel.Sol xgetSol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel.Sol target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel.Sol)get_store().find_element_user(SOL$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sol" element
     */
    public void setSol(br.uniriotec.tabd2.imovel.Imovel.Sol.Enum sol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOL$10);
            }
            target.setEnumValue(sol);
        }
    }
    
    /**
     * Sets (as xml) the "sol" element
     */
    public void xsetSol(br.uniriotec.tabd2.imovel.Imovel.Sol sol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.uniriotec.tabd2.imovel.Imovel.Sol target = null;
            target = (br.uniriotec.tabd2.imovel.Imovel.Sol)get_store().find_element_user(SOL$10, 0);
            if (target == null)
            {
                target = (br.uniriotec.tabd2.imovel.Imovel.Sol)get_store().add_element_user(SOL$10);
            }
            target.set(sol);
        }
    }
    /**
     * An XML possui_vaga(@http://uniriotec.br/TABD2/Imovel).
     *
     * This is an atomic type that is a restriction of br.uniriotec.tabd2.imovel.Imovel$PossuiVaga.
     */
    public static class PossuiVagaImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements br.uniriotec.tabd2.imovel.Imovel.PossuiVaga
    {
        
        public PossuiVagaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PossuiVagaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML sol(@http://uniriotec.br/TABD2/Imovel).
     *
     * This is an atomic type that is a restriction of br.uniriotec.tabd2.imovel.Imovel$Sol.
     */
    public static class SolImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements br.uniriotec.tabd2.imovel.Imovel.Sol
    {
        
        public SolImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SolImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
