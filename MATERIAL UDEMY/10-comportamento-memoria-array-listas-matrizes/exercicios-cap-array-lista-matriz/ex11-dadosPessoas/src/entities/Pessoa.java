package entities;

public class Pessoa {
	private String nome;
	private char genero;
	private float altura;
	
	public Pessoa(char genero, float altura) {
		super();
		this.genero = genero;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
