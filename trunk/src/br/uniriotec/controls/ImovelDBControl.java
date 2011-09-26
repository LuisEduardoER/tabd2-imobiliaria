package br.uniriotec.controls;

import java.sql.SQLException;

import org.apache.beehive.controls.system.jdbc.JdbcControl;
import org.apache.beehive.controls.api.bean.ControlExtension;

import br.uniriotec.beans.Imovel;

@ControlExtension
@JdbcControl.ConnectionDataSource(jndiName = "imovelDS")
public interface ImovelDBControl extends JdbcControl {

	@JdbcControl.SQL(statement="SELECT id, endereco || ' ' || BAIRRO || ' ' || CIDADE as endereco, preco, quartos, sol, possui_vaga as POSSUIVAGA FROM tb_imovel "
		+ " WHERE 1=1 {sql: p_where} {sql: p_orderby} " )
	Imovel[] getImoveis(String p_where, String p_orderby) throws SQLException;
	 

	static final long serialVersionUID = 1L;

}