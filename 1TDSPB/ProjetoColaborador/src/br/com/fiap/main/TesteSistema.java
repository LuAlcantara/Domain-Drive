package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		Colaborador objetoColaborador = new Colaborador();
		Endereco objetoEndereco = new Endereco();
		
		
		objetoColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do Colaborador"));
		objetoColaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Colaborador")));
		objetoColaborador.setQtdadeHoras(Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de horas trabalhadas")));
		objetoColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora")));
		
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro do Colaborador"));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do logradouro")));
		objetoEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		objetoColaborador.setEndereco(objetoEndereco);
		
		System.out.println("Informações do Colaborador\n" + objetoColaborador.getNomeIdade() + 
				"\nHoras Trabalhadas: " + objetoColaborador.getQtdadeHoras() + 
				"\nValor da Hora Trabalhada: " + objetoColaborador.getValorHora() + 
				"\nSalario: " + objetoColaborador.calcularSalario() + 
				"\nPaga Taxa? " + objetoColaborador.pagarTaxa());

	}

}
