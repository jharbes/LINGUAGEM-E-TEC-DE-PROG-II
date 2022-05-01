package model;

public abstract class Animal {
	public String nome;
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract String Respirar();
	public abstract String Dormir();
	public abstract String Comer();
	public abstract String Andar();
}