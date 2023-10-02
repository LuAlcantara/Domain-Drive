package br.com.fiap.beans;

public class Colaborador {
	private String nome;
	private String cargo;
	private double valorHora;
	private double qtdadeHora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQtdadeHora() {
		return qtdadeHora;
	}
	public void setQtdadeHora(double qtdadeHora) {
		this.qtdadeHora = qtdadeHora;
	}
	
	//get com mais de um atributo
	public String getTudoColaborador() {
		return "\nNome: " + nome + "\nCargo: " + cargo + "\nValor da Hora: " + valorHora + "\nQuantidade de Horas: " + qtdadeHora;
	}
	
	//metódo worker
	public double calcularSalario() {
		return valorHora * qtdadeHora;
	}
	
	//if else
	public String pagarTaxa() {
		if (calcularSalario() > 17500.55) {
			return "Paga Taxa";
		}else {
			return "Não Paga Taxa";
		}
	}
	

}
