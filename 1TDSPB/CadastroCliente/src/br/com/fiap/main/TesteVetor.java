package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteVetor {
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	//Inteiro
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//Double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
		
	}

	public static void main(String[] args) {
		
		//Preparar Vetor e determinar o máximo de posições
		Cliente[] vetorClientes = new Cliente[2];
		
		// Indice controla as posições (alocações)
		int indice=0;
		
		//Entrada
		do {
			vetorClientes[indice] = new Cliente();
			vetorClientes[indice].setCodigo(inteiro("Digite o código do Cliente"));
			vetorClientes[indice].setNome(texto("Digite o nome do Cliente"));
			vetorClientes[indice].setRg(texto("Digite o RG do Cliente"));
			vetorClientes[indice].setRenda(real("Digite a renda do Cliente"));
			
			indice ++;
			
		} while (JOptionPane.showConfirmDialog(null,"Cadastrar mais Cliente?","CADASTRO DE CLIENTES", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		//Saídas Vetor utilizamos o for
		for (int contador = 0; contador < indice; contador ++) {
			System.out.println("\n\nCÓDIGO DO CLIENTE: " + vetorClientes[contador].getCodigo() + 
								"\nNOME DO CLIENTE: " + vetorClientes[contador].getNome() + 
								"\nRG DO CLIENTE: " + vetorClientes[contador].getRg() + 
								"\nRENDA DO CLIENTE: " + vetorClientes[contador].getRenda());
		}

	}

}
