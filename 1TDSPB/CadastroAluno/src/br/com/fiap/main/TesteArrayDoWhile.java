package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteArrayDoWhile {
	
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
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Aluno objAluno;
		
		do {
			objAluno = new Aluno();
			objAluno.setRm (inteiro("Informe o número do RM"));
			objAluno.setNome(texto("Informe o Nome do Aluno"));
			objAluno.setTurma(texto("Informe a Turma do Aluno"));
			objAluno.setNota(real("Informe a Nota do Aluno"));
			
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais Alunos?", "CADASTRO DE ALUNOS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		for(Aluno a: listaAlunos) {
			System.out.println("\n\nRM: " + a.getRm() + 
								"\nNome: " + a.getNome() +
								"\nTurma: " + a.getTurma() + 
								"\nNota: " + a.getTurma());
		}

	}

}
