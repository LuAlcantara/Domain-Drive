package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

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
		// Instanciar, preparar a quantidade de posições
		Produto[] vetorProdutos = new Produto[3];
		
		// Indice controla as posições
		int indice = 0;
		
		// Começa a executar as entradas
		do {
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setCodigo(inteiro("Digite o Código"));
			vetorProdutos[indice].setTipo(texto("Digite o Tipo do Produto"));
			vetorProdutos[indice].setMarca(texto("Digite a Marca do Produto"));
			vetorProdutos[indice].setQuantidade(inteiro("Digite a Quantidade"));
			vetorProdutos[indice].setPreco(real("Digite o Preço"));
			
			indice++;
			
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar mais produtos no carrinho?",
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		// O contador controla as posições de saída de cada produto no vetor
		for(int contador = 0; contador < indice; contador ++) {
			System.out.println(
					"\n\nCódigo: "+ vetorProdutos[contador].getCodigo() + 
					"\nTipo: " + vetorProdutos[contador].getTipo() + 
					"\nMarca: " + vetorProdutos[contador].getMarca() + 
					"\nQuantidade: " + vetorProdutos[contador].getQuantidade() + 
					"\nPreço: " + vetorProdutos[contador].getPreco());
		}
	}

}
