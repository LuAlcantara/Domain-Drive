package br.com.fiap.beans;

public class Produto {
	private int codigo;
	private String marca;
	private String modelo;
	private int quantidade;
	private double preco;
	
	public Produto() {
		super();
	}

	public Produto(int codigo, String marca, String modelo, int quantidade, double preco) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
