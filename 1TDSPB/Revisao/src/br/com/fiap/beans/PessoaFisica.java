package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{
	private String cpf;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String email, String cpf) {
		super(nome, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String identificador() {
		return "Pessoa Física";
	}

}
