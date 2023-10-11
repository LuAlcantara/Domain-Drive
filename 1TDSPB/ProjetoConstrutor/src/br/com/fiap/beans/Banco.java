package br.com.fiap.beans;

public class Banco {
	private String nome;
	private int agencia;
	private Endereco endereco;
	private Cliente cliente;
	
	public Banco() {
		super();
	}

	public Banco(String nome, int agencia) {
		super();
		this.nome = nome;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	

}
