package br.uniriotec.services;

import javax.jws.*;
import org.apache.beehive.controls.api.bean.Control;
import br.uniriotec.controls.ImovelDBControl;
import br.uniriotec.tabd2.imovel.ImovelListDocument;
import br.uniriotec.util.Utils;
import br.uniriotec.beans.Imovel;


@WebService
public class ImovelService {

	@Control
	ImovelDBControl control;
	
	@WebMethod
	public ImovelListDocument getImoveis(int quartos) throws Exception {
		
		String where = "";
		
		if (quartos > 0)
			where += " AND quartos = " + String.valueOf(quartos);
		
		Imovel[] imoveis = control.getImoveis(where, "");
		ImovelListDocument xml = parseImovel2XML(imoveis);
		
		
		return xml;
	}
	
	private ImovelListDocument parseImovel2XML(Imovel[] imoveis) throws Exception {
		ImovelListDocument doc = ImovelListDocument.Factory.newInstance();
		
		doc.addNewImovelList();
		
		for(int i=0; i< imoveis.length; i++)
		{
			Utils.parsePOJO2XML(imoveis[i], doc.getImovelList().addNewImovel());
		}
		
		return doc;
	}
	
}