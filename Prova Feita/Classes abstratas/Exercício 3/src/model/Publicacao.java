package model;

public abstract class Publicacao {
	public String titulo;
	public int ano;
	public String [] autores;
	
	public Publicacao(String titulo, int ano, String[] autores) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.autores = autores;
	}

	public abstract void imprimirInformacoes();
}