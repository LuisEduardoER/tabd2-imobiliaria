package br.uniriotec.testeimovel.wsimovel;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Sun Oct 02 17:15:22 BRT 2011 */

public class ImovelServiceService_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements br.uniriotec.testeimovel.wsimovel.ImovelServiceService {

  public ImovelServiceService_Impl() throws javax.xml.rpc.ServiceException {
    this("br/uniriotec/testeimovel/wsimovel/ImovelServiceService_saved_wsdl.wsdl", null);
  }
  
  public ImovelServiceService_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public ImovelServiceService_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://br/uniriotec/services", "ImovelServiceService"),
          "br/uniriotec/testeimovel/wsimovel/ImovelServiceService_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: ImovelServiceSoapPort 
  // Port Type: ImovelService 
  //***********************************

  br.uniriotec.testeimovel.wsimovel.ImovelService mvar_ImovelServiceSoapPort;

  /**
   * returns ImovelServiceSoapPort port in this service 
   */
  public br.uniriotec.testeimovel.wsimovel.ImovelService getImovelServiceSoapPort() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_ImovelServiceSoapPort == null) {
      mvar_ImovelServiceSoapPort =
        new br.uniriotec.testeimovel.wsimovel.ImovelService_Stub(_getPort("ImovelServiceSoapPort"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_ImovelServiceSoapPort)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_ImovelServiceSoapPort;
  }

  /**
   * @deprecated  Use getImovelServiceSoapPort(byte[] username, byte[] password)
   */
  public br.uniriotec.testeimovel.wsimovel.ImovelService getImovelServiceSoapPort(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getImovelServiceSoapPort();
  }

  public br.uniriotec.testeimovel.wsimovel.ImovelService getImovelServiceSoapPort(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getImovelServiceSoapPort();
  }
  
  
}