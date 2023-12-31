package br.com.fiap.main;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		// Instanciar objetos
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Carro objetoCarro = new Carro();
				
		//Imput - Cliente
		
		objetoCliente.setNome("Lucas");
		objetoCliente.setCpf("42595083856");
		objetoCliente.setIdade(27);
		objetoCliente.setValor(3555);
		
		//Imput - Endereço
		objetoEndereco.setLogradouro("Rua Sertões de Cratéus");
		objetoEndereco.setNumero(71);
		objetoEndereco.setComplemento("Casa");
		objetoEndereco.setCep("03350-070");
		objetoEndereco.setBairro("Tatuapé");
		objetoEndereco.setMunicipio("São Paulo");
		objetoEndereco.setEstado("São Paulo");
		
		//Imput - Carro
		objetoCarro.setMarca("Jeep");
		objetoCarro.setModelo("Renegade");
		objetoCarro.setAno(2023);
		objetoCarro.setValorCarro(150.000);
		
		//Output - Cliente
		System.out.println("Nome do Cliente: " + objetoCliente.getNome() + 
				"\nIdade: " + objetoCliente.getIdade());
		
		//Output - Endereço
		System.out.println("Logradouro: " + objetoEndereco.getLogradouro());
		
		//Output - Carro
		System.out.println("Carro: " + objetoCarro.getMarca() + 
				"\nModelo: " + objetoCarro.getModelo());
		

	}

}
