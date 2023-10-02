package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente objetoCliente = new Cliente();
		Colaborador objetoColaborador = new Colaborador();
		Endereco objetoEndereco = new Endereco();
		
		//Entradas Cliente
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente"));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cliente")));
		
		//Entradas Endereco
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Logradouro")));
		objetoEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		objetoCliente.setEndereco(objetoEndereco);
		
		// Entradas Colaborador
		objetoColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do Colaborador"));
		objetoColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo do Colaborador"));
		objetoColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada")));
		objetoColaborador.setQtdadeHora(Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas")));
		
		//Saídas
		System.out.println("Nome do cliente: " + objetoCliente.getNome() + 
				"\nIdade: " + objetoCliente.getIdade() + 
				objetoEndereco.getTudoEndereco() + 
				"\n\nInformações do Colaborador\n" + 
				objetoColaborador.getTudoColaborador() + 
				"\nSalário: " + objetoColaborador.calcularSalario());
		
		System.out.println("\n\nInformações de Taxa\n" + objetoColaborador.pagarTaxa());
		

	}

}
