package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteSistema {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
	
	PessoaFisica objPf = new PessoaFisica();
	PessoaJuridica objPj = new PessoaJuridica();
	Endereco objEndereco = new Endereco();
	
	
	System.out.println(objPf.identificador());
	
	System.out.println(objPj.identificador());

	}

}
