package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.DepCalcados;
import br.com.fiap.beans.DepEletronicos;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Loja;

public class TesteSistemas {
	
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
		
		////String nomeProduto, double valorProduto, int quantidadeProduto, String marcaCelular
		DepEletronicos objDepEletronicos = new DepEletronicos(
				texto("Nome do Produto"),
				real("Valor"),
				inteiro("Quantidade"),
				texto("Marca"));
		
		//String nomeProduto, double valorProduto, int quantidadeProduto, String sapato
		DepCalcados objDepCalcados = new DepCalcados(
				texto("Digite o nome do produto"),
				real("Digite o valor do produto"),
				inteiro("Digite a quantidade do produto"),
				texto("Digite a marca do produto"));
		
		//String logradouro, String cep, int numero, String bairro
		Endereco objEndereco = new Endereco(
				texto("Digite o logradouro"),
				texto("Digite o CEP"),
				inteiro("Digite o número do logradouro"),
				texto("Digite o bairro"));
	}

}
