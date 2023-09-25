package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente objCliente = new Cliente ();
		Colaborador objColaborador = new Colaborador ();
		Endereco objEndereco = new Endereco ();
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Informe o Logradouro"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número")));
		objCliente.setEndereco(objEndereco);
		
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do Colaborador"));
		objColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario")));
		
		System.out.println("Informações do Cliente" + 
		"\nNome: " + objCliente.getNome() + 
		"\nIdade: " + objCliente.getIdade() + 
		"\n\nInformações Endereço: " +
		"\nLogradouro: " + objCliente.getEndereco().getLogradouro() + 
		"\nNumero: " + objCliente.getEndereco().getNumero() + 
		"\n\nInformações do Colaborador" + objColaborador.getTudo());
		
		System.out.println("TAXA: \n" + objColaborador.pagaTaxa());

	}

}
