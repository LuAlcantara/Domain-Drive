package br.com.fiap.main;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteArrayProdutos {
	
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
		//Lista de Produtos
		List<Produto> listaProdutos = new ArrayList<Produto>();

		//Prepara objProduto
		Produto objProduto;

		//Entrada
		do {
			objProduto = new Produto();
			objProduto.setCodigo(inteiro("Digite o código do produto"));
			objProduto.setTipo(texto("Digite o tipo do produto"));
			objProduto.setMarca(texto("Digite a marca do produto"));
			objProduto.setPreco(real("Digite o preço do produto"));
			
			listaProdutos.add(objProduto);
		
		} while (JOptionPane.showConfirmDialog(null, "Adicionar mais produtos no carrinho?",
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		//Saídas
		//Foreach percorre todos os elementos (produtos) da lista para serem exibidos
		for (Produto p : listaProdutos) {
			System.out.println("\n\nCódigo: " + p.getCodigo() + 
								"\nTipo: " + p.getTipo() + 
								"\nMarca: " + p.getMarca() + 
								"\nPreço: " + p.getPreco());
		}
	
	
	
	}

}
