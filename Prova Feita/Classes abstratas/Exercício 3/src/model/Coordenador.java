package model;

public class Coordenador {
	public String nome;
	public String email;
	public String instituicao_origem;
	public String telefone; // endereco para contato
	public String funcao;
	
	public Coordenador(String nome, String email, String instituicao_origem, String telefone, String funcao) {
		super();
		this.nome = nome;
		this.email = email;
		this.instituicao_origem = instituicao_origem;
		this.telefone = telefone;
		this.funcao = funcao;
	}
}