package br.uniriotec.beans;

import java.math.BigDecimal;

/**
 * Bean que representa Imovel
 * @author LABCCET
 */
public class Imovel {
	private int id;
	private String endereco;
	private BigDecimal preco;
	private int quartos ;
	private String possuiVaga;
	private String sol; //M, T, MT
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public int getQuartos() {
		return quartos;
	}
	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	public String getPossuivaga() {
		return possuiVaga;
	}
	public void setPossuivaga(String possuiVaga) {
		this.possuiVaga = possuiVaga;
	}
	public String getSol() {
		return sol;
	}
	public void setSol(String sol) {
		this.sol = sol;
	}
	

}
