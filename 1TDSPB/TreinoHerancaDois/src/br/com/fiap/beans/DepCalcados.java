package br.com.fiap.beans;

public class DepCalcados extends Loja{
	private String sapato;

	public DepCalcados() {
		super();
	}

	public DepCalcados(String sapato) {
		super();
		this.sapato = sapato;
	}

	public DepCalcados(String nomeProduto, double valorProduto, int quantidadeProduto, String sapato) {
		super(nomeProduto, valorProduto, quantidadeProduto);
		this.sapato = sapato;
	}

	public String getSapato() {
		return sapato;
	}

	public void setSapato(String sapato) {
		this.sapato = sapato;
	}
	
	

}
