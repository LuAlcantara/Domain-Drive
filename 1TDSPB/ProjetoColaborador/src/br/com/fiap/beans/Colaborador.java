package br.com.fiap.beans;

public class Colaborador {
	private String nome;
	private int idade;
	private double qtdadeHoras;
	private double valorHora;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getQtdadeHoras() {
		return qtdadeHoras;
	}
	public void setQtdadeHoras(double qtdadeHoras) {
		this.qtdadeHoras = qtdadeHoras;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNomeIdade() {
		return "Nome: " + nome + "\nIdade: " + idade;
	}
	
	public double calcularSalario () {
		return valorHora * qtdadeHoras;
	}
	
	public String pagarTaxa() {
		String informacao = null;
		if (calcularSalario() > 15200.555) {
			informacao = "Paga Taxa";
		}else {
			informacao = "Isento Taxa";
		}
		
		return informacao;
	}
}
