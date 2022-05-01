package model;

public class Dog extends Animal{
	
	public Dog(String nome) {
		super(nome);
	}

	public String Latir() {
		return "Cachorro latindo";
	}
	
	@Override
	public String Respirar() {
		return "Cachorro respirando";
	}

	@Override
	public String Dormir() {
		return "Cachorro dormindo";
	}

	@Override
	public String Comer() {
		return "Cachorro comendo";
	}

	@Override
	public String Andar() {
		return "Cachorro andando";
	}
}