package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		//int rm, String nome, String turma, double nota
		Aluno objAluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do Aluno")),
				JOptionPane.showInputDialog("Digite o nome do Aluno"),
				JOptionPane.showInputDialog("Digite a turma do Aluno"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Aluno"))
				);
		//String nome, String cargo, double salario
		Colaborador objColaborador = new Colaborador(
				JOptionPane.showInputDialog("Digite o Nome do Colaborador"),
				JOptionPane.showInputDialog("Digite o Cargo do Colaborador"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do Colaborador"))
				);
		////String logradouro, String cep, int numero
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o Logradouro"),
				JOptionPane.showInputDialog("Digite o CEP"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Logradouro"))
				);
		objAluno.setEndereco(objEndereco);
		
		System.out.println("Informações do Aluno" + 
				"\nRM do Aluno: " + objAluno.getRm() + 
				"\nNome: " + objAluno.getNome() + 
				"\nTurma: " + objAluno.getTurma() + 
				"\nNota: " + objAluno.getNota() + 
				"\nLogradouro: " + objAluno.getEndereco().getLogradouro() + 
				"\nCEP: " + objAluno.getEndereco().getCep() + 
				"\nNumero: " + objAluno.getEndereco().getNumero() + 
				"\n\nInformações do Colaborador" + 
				"\nNome: " + objColaborador.getNome() + 
				"\nCargo: " + objColaborador.getCargo() + 
				"\nSalário: " + objColaborador.getSalario());

	}

}
