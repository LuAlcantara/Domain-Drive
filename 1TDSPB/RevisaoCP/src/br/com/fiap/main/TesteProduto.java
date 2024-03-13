package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {

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
		Produto[] vetorProduto = new Produto [2];
		int indice = 0;
		
		do {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setCodigo(inteiro("Digite o Código do Produto"));
			vetorProduto[indice].setMarca(texto("Digite a Marca do Produto"));
			vetorProduto[indice].setModelo(texto("Digite o Modelo do Produto"));
			vetorProduto[indice].setQuantidade(inteiro("Digite a Quantidade do Produto"));
			vetorProduto[indice].setPreco(real("Digite o Preço do Produto"));
			
			indice ++;
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar mais produtos no carrinho?", 
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

		//Saídas
		for (int contador = 0; contador < indice; indice ++) {
			System.out.println("\n\nCódigo do Produto: " + vetorProduto[contador].getCodigo() +
								"\nMarca do Produto: " + vetorProduto[contador].getMarca() +
								"\nModelo do Produto: " + vetorProduto[contador].getModelo() +
								"\nQuantidade do Produto: " + vetorProduto[contador].getQuantidade() + 
								"\nPreço do Produto: " + vetorProduto[contador].getPreco());
	}
	
	
		
	}

}
