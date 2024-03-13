package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProdutoArray {
	
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
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		Produto objProduto;
		
		do {
			objProduto = new Produto();
			objProduto.setCodigo(inteiro("Digite o Código do Produto"));
			objProduto.setMarca(texto("Digite a Marca do Produto"));
			objProduto.setModelo(texto("Digite o Modelo do Produto"));
			objProduto.setQuantidade(inteiro("Digite a Quantidade do Produto"));
			objProduto.setPreco(real("Digite o Preço do Produto"));
			
		} while (JOptionPane.showConfirmDialog(null, "Deseja Adicionar mais Produtos?", 
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		for(Produto p: listaProduto) {
			System.out.println("\n\nCódigo do Produto: " + p.getCodigo() + 
								"\nMarca do Produto: " + p.getMarca() + 
								"\nModelo do Produto: " + p.getModelo() + 
								"\nQuantidade do Produto: " + p.getQuantidade() + 
								"\nPreço do Produto: " + p.getPreco());
		}

	}

}
