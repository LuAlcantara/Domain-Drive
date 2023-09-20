package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Colaborador objetoColaborador = new Colaborador();
		
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente"));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cliente")));
		objetoCliente.setEmail(JOptionPane.showInputDialog("Digite o e-mail do Cliente"));
		
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Logradouro")));
		objetoEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		objetoEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
		objetoCliente.setEndereco(objetoEndereco);
		
		objetoColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do Colaborador(a)"));
		objetoColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do Colaborador")));
		
		System.out.println("Nome do Cliente: " + objetoCliente.getNome() + 
				"\nIdade: " + objetoCliente.getIdade() + 
				"\nE-mail: " + objetoCliente.getEmail() + 
				"\n\nLogradouro: " + objetoCliente.getEndereco().getLogradouro() + 
				"\nNumero: " + objetoCliente.getEndereco().getNumero() + 
				"\nCEP: " + objetoCliente.getEndereco().getCep() + 
				"\nBairro: " + objetoCliente.getEndereco().getBairro() + 
				"\n\nNome do Colaborador: " + objetoColaborador.getNome() +
				"\nSalario: " + objetoColaborador.getSalario());
	}

}
