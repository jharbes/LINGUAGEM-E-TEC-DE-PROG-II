package model;

public class Lion extends Animal {

	public Lion(String nome) {
		super(nome);
	}

	@Override
	public String Respirar() {
		return "Leão respirando";
	}

	@Override
	public String Dormir() {
		return "Leão dormindo";
	}

	@Override
	public String Comer() {
		return "Leão comendo";
	}

	@Override
	public String Andar() {
		return "Leão andando";
	}
}