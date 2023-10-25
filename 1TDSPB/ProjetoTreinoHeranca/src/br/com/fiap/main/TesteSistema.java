package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Credito;
import br.com.fiap.beans.Debito;

public class TesteSistema {
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	// int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	//double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		//String nome, String bandeira, int numero, int cvv, double saldo, double parcela
		Credito objCredito = new Credito(
				texto("Nome"),
				texto("Bandeira"),
				inteiro("Número"),
				inteiro("CVV"),
				real("Saldo"),
				real("Parcela")
				);
		//String nome, String bandeira, int numero, int cvv, double saldo, double consignado
		Debito objDebito = new Debito (
				texto("Nome"),
				texto("Bandeira"),
				inteiro("Número"),
				inteiro("CVV"),
				real("Saldo"),
				real("Consignado")
				);
		
		//Saídas
		System.out.println("Limite Crédito: " + objCredito.limite() + 
				"\nLimite Debito: " + objDebito.limite());

	}

}
