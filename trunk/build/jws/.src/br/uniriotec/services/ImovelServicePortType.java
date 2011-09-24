package br.uniriotec.services;

/**
 * Generated interface, please do not edit.
 * Date: [Sat Sep 24 13:42:30 BRT 2011]
 */

public interface ImovelServicePortType extends java.rmi.Remote {

  /**
   * Web Method: getImoveis ...
   */
  br.uniriotec.tabd2.imovel.ImovelListDocument getImoveis(int quartos)
      throws java.rmi.RemoteException, java.lang.Exception;
}
