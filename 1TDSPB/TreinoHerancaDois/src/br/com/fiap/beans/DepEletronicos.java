package br.com.fiap.beans;

public class DepEletronicos extends Loja{
	private String marcaCelular;

	public DepEletronicos() {
		super();
	}

	public DepEletronicos(String marcaCelular) {
		super();
		this.marcaCelular = marcaCelular;
	}

	public DepEletronicos(String nomeProduto, double valorProduto, int quantidadeProduto, String marcaCelular) {
		super(nomeProduto, valorProduto, quantidadeProduto);
		this.marcaCelular = marcaCelular;
	}

	public String getMarcaCelular() {
		return marcaCelular;
	}

	public void setMarcaCelular(String marcaCelular) {
		this.marcaCelular = marcaCelular;
	}
	
	

}
