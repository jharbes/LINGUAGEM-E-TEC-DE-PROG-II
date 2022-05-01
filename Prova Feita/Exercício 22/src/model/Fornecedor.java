package model;

public class Fornecedor {
	public String nome;
	public String telefone;
	public String cnpj;
	public Endereco endereco;
	
	public Fornecedor(String nome, String telefone, String cnpj, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
}