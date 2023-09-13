package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Produto objetoProduto = new Produto();

		objetoCliente.setNome("Lucas");
		objetoCliente.setIdade(27);
		objetoCliente.setEmail("cliente@internet.com");

		objetoEndereco.setLogradouro("Rua Sertoes de Cratéus");
		objetoEndereco.setNumero(71);
		objetoEndereco.setCep("03350-070");
		objetoEndereco.setBairro("Vila Invernada");
		objetoEndereco.setMunicipio("São Paulo");

		objetoProduto.setTipo("Celular");
		objetoProduto.setMarca("Apple");
		objetoProduto.setQuantidade(2);
		objetoProduto.setValor(6000);
		
		System.out.println("Nome do Cliente: " + objetoCliente.getNome() +
				"\nIdade: " + objetoCliente.getIdade() + 
				"\nEmail: " + objetoCliente.getEmail() + 
				"\nLogradouro: " + objetoEndereco.getLogradouro() + 
				"\nNumero: " + objetoEndereco.getNumero() + 
				"\nCEP: " + objetoEndereco.getCep() + 
				"\nBairro: " + objetoEndereco.getBairro() + 
				"\nMunicipio: " + objetoEndereco.getMunicipio() + 
				"\nTipo: " + objetoProduto.getTipo() + 
				"\nMarca: " + objetoProduto.getMarca() + 
				"\nQuantidade: " + objetoProduto.getQuantidade() + 
				"\nValor: " + objetoProduto.getValor());
	}

}
