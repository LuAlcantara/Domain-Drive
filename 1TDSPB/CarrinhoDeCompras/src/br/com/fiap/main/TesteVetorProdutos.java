package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorProdutos {
	
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
		// Controle de posições
		Produto[] vetorProduto = new Produto[3];
		
		int indice = 0;
		
		//Entradas
		do {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setCodigo(inteiro("Digite o código do produto"));
			vetorProduto[indice].setTipo(texto("Digite o tipo do produto"));;
			vetorProduto[indice].setMarca(texto("Digite a marca do produto"));
			vetorProduto[indice].setPreco(real("Digite o preço do produto"));
			
			indice ++;
			
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar mais produto no carrinho?", 
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)== 0);
		
		// Saídas
		for (int contador = 0; contador < indice; contador ++) {
			System.out.println("\n\nCódigo: " + vetorProduto[contador].getCodigo() + 
								"\nTipo: " + vetorProduto[contador].getTipo() + 
								"\nMarca: " + vetorProduto[contador].getMarca() + 
								"\nPreço: " + vetorProduto[contador].getPreco()					
					);
		}
	}

}
