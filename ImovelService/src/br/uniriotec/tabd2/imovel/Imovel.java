/**
 * Generated from schema type t=Imovel@http://uniriotec.br/TABD2/Imovel
 */
package br.uniriotec.tabd2.imovel;

public class Imovel implements java.io.Serializable {

  private int id;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  private java.lang.String endereco;

  public java.lang.String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(java.lang.String endereco) {
    this.endereco = endereco;
  }

  private java.math.BigDecimal preco;

  public java.math.BigDecimal getPreco() {
    return this.preco;
  }

  public void setPreco(java.math.BigDecimal preco) {
    this.preco = preco;
  }

  private int quartos;

  public int getQuartos() {
    return this.quartos;
  }

  public void setQuartos(int quartos) {
    this.quartos = quartos;
  }

  private br.uniriotec.tabd2.imovel.Possui_Vaga possui_Vaga;

  public br.uniriotec.tabd2.imovel.Possui_Vaga getPossui_Vaga() {
    return this.possui_Vaga;
  }

  public void setPossui_Vaga(br.uniriotec.tabd2.imovel.Possui_Vaga possui_Vaga) {
    this.possui_Vaga = possui_Vaga;
  }

  private br.uniriotec.tabd2.imovel.Sol sol;

  public br.uniriotec.tabd2.imovel.Sol getSol() {
    return this.sol;
  }

  public void setSol(br.uniriotec.tabd2.imovel.Sol sol) {
    this.sol = sol;
  }

}
