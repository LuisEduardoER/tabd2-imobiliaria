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
	public ImovelListDocument getImoveis(String bairro, String cidade) throws Exception {
		
		StringBuffer sbWhere = new StringBuffer();
			
		if (bairro != null && bairro.trim().length() > 0)
		{
			sbWhere.append(" AND bairro ILIKE '%");
			sbWhere.append(bairro);
			sbWhere.append("%'");
		}
		
		if (cidade != null && cidade.trim().length() > 0)
		{
			sbWhere.append(" AND cidade ILIKE '%");
			sbWhere.append(cidade);
			sbWhere.append("%'");
		}
		
		Imovel[] imoveis = control.getImoveis(sbWhere.toString(), "");
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