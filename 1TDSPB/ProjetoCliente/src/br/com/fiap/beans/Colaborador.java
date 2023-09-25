package br.com.fiap.beans;

public class Colaborador {
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getTudo() {
		return "\nNome do Colaborador: "+ nome + "\nSalário: " + salario;
	}
	
	public String pagaTaxa() {
		String informacao = null;
		
		if (salario > 22000) {
			informacao = "Paga Taxa";
		}else {
			informacao = "Não Paga Taxa";
		}
		
		return informacao;
	}

}
