
package br.uniriotec.services;

import java.lang.reflect.Field;
import org.apache.beehive.controls.api.ControlException;
import org.apache.beehive.controls.api.bean.Controls;
import org.apache.beehive.controls.api.versioning.VersionRequired;
import org.apache.beehive.controls.api.context.ControlBeanContext;
import org.apache.beehive.controls.runtime.bean.EventAdaptor;
import org.apache.beehive.controls.runtime.bean.AdaptorPersistenceDelegate;

@SuppressWarnings("all")
public class ImovelServiceClientInitializer
extends org.apache.beehive.controls.runtime.bean.ClientInitializer
{
    static final Field _controlField;
    static
    {
        try
        {
            _controlField = br.uniriotec.services.ImovelService.class.getDeclaredField("control");
            _controlField.setAccessible(true);
        }
        catch (NoSuchFieldException __bc_nsfe)
        {
            throw new ExceptionInInitializerError(__bc_nsfe);
        }
    }
    
    
    private static void initializeFields(ControlBeanContext cbc,
    br.uniriotec.services.ImovelService client)
    {
        try
        {
            String __bc_id;
            //
            // Initialize any nested controls used by the client
            //
            __bc_id = "control";
            br.uniriotec.controls.ImovelDBControlBean _control = (cbc == null ? null : (br.uniriotec.controls.ImovelDBControlBean)cbc.getBean(__bc_id));
            if (_control == null)
            _control = (br.uniriotec.controls.ImovelDBControlBean) Controls.instantiate(br.uniriotec.controls.ImovelDBControlBean.class, getAnnotationMap(cbc, _controlField), cbc, __bc_id );
            
            
            client.control = _control; 
        }
        catch (RuntimeException __bc_re) { throw __bc_re; }
        catch (Exception __bc_e)
        {
            __bc_e.printStackTrace();
            throw new ControlException("Initializer failure", __bc_e);
        }
    }
    
    public static void initialize(ControlBeanContext cbc, br.uniriotec.services.ImovelService client)
    {
        
        initializeFields( cbc, client );
    }
}
