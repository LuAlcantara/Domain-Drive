package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Conta;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente objetoCliente = new Cliente();
		Conta objetoConta = new Conta();
		Endereco objetoEndereco = new Endereco();
		
		objetoCliente.setNome("Lucas Alcantara");
		objetoCliente.setCpf("123.456.789-00");
		
		objetoEndereco.setLogradouro("Rua do Apito");
		objetoEndereco.setNumero(001);
		objetoEndereco.setCep("12345-000");
		objetoEndereco.setBairro("Jardim Paulista");
		objetoEndereco.setMunicipio("São Paulo");
		objetoEndereco.setCidade("São Paulo");
		objetoEndereco.setNacionalidade("Brasil");
		
		objetoConta.setSaldo(13.700);
		
		System.out.println("Nome do Cliente: " + objetoCliente.getNome() + 
				"\nCPF: " + objetoCliente.getCpf() + 
				"\nLogradouro: " + objetoEndereco.getLogradouro() + 
				"\nNumero: " + objetoEndereco.getNumero() + 
				"\nCEP: " + objetoEndereco.getCep() + 
				"\nBairro: " + objetoEndereco.getBairro() + 
				"\nMunicipio: " + objetoEndereco.getMunicipio() + 
				"\nCidade: " + objetoEndereco.getCidade() + 
				"\nNacionalidade: " + objetoEndereco.getNacionalidade() + 
				"\nSaldo : " + objetoConta.getSaldo());

	}

}
