package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String identificador() {
		return "Pessoa Juridica";
	}

}
