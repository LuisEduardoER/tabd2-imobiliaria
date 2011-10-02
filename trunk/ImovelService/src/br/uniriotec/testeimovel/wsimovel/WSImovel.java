package br.uniriotec.testeimovel.wsimovel;

import br.uniriotec.tabd2.imovel.*;

import br.uniriotec.testeimovel.wsimovel.ImovelService;
import br.uniriotec.testeimovel.wsimovel.ImovelServiceService_Impl;

import java.math.BigDecimal;


public class WSImovel {
	
	public static ImovelService webservice;
	public static ImovelServiceService_Impl locator;
	
	
	public static void main (String [] args) {
		
		String wsdlurl = "http://localhost:7001/TABD2_IMOBILIARIA/ImovelService?WSDL";
		try{
			locator= new ImovelServiceService_Impl (wsdlurl);
			webservice = locator.getImovelServiceSoapPort();
			System.out.println("****************************");
			LstImovel lstImovel = webservice.getImoveis("botafogo", "rio de janeiro");
			
			for(int i=0; i< lstImovel.getImovel().length; i++){
				
				Imovel imovel = lstImovel.getImovel()[i];
				System.out.println(imovel.getEndereco());
				System.out.println(imovel.getPreco());
				System.out.println(imovel.getQuartos());
				System.out.println(imovel.getPossui_Vaga());
				System.out.println(imovel.getSol());
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	

}

