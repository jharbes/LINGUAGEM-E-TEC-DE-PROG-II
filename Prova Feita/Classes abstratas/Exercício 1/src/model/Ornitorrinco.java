package model;

public class Ornitorrinco extends Animal {

	public Ornitorrinco(String nome) {
		super(nome);
	}

	@Override
	public String Respirar() {
		return "Ornitorrinco respirando";
	}

	@Override
	public String Dormir() {
		return "Ornitorrinco dormindo";
	}

	@Override
	public String Comer() {
		return "Ornitorrinco comendo";
	}

	@Override
	public String Andar() {
		return "Ornitorrinco andando";
	}
}