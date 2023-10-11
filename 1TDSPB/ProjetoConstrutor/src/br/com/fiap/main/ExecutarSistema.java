package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class ExecutarSistema {

	public static void main(String[] args) {
		Banco objBanco = new Banco(
				JOptionPane.showInputDialog("Digite o Banco"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Agência")));
		
		//String logradouro, String cep, String bairro, int numero
		Endereco objEndereco = new Endereco(				
				JOptionPane.showInputDialog("Digite o Logradouro"),
				JOptionPane.showInputDialog("Digite o CEP"),
				JOptionPane.showInputDialog("Digite o Bairro"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número do logradouro")));
		objBanco.setEndereco(objEndereco);
		
		//String nome, String cpf, int conta, String email, double saldo
				Cliente objCliente = new Cliente(
				JOptionPane.showInputDialog("Digite o nome do cliente"),
				JOptionPane.showInputDialog("Digite o número do CPF"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta")),
				JOptionPane.showInputDialog("Digite o email do cliente"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo")));
		objBanco.setCliente(objCliente);
		
		System.out.println("Banco: " + objBanco.getNome() + 
				"\nAgência: " + objBanco.getAgencia() + 
				"\nLogradouro: " + objBanco.getEndereco().getLogradouro() + 
				"\nCEP: " + objBanco.getEndereco().getCep() + 
				"\nBairro: " + objBanco.getEndereco().getBairro() + 
				"\nNúmero: " + objBanco.getEndereco().getNumero() + 
				"\n\nInformações do Cliente" + 
				"\nNome: " + objBanco.getCliente().getNome() + 
				"\nCPF: " + objBanco.getCliente().getCpf() + 
				"\nNúmero da conta: " + objBanco.getCliente().getConta() + 
				"\nEmail: " + objBanco.getCliente().getEmail() + 
				"\nSaldo: " + objBanco.getCliente().getSaldo());
		

		
		

	}

}
