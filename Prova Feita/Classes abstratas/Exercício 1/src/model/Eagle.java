package model;

public class Eagle extends Animal {
	
	public Eagle(String nome) {
		super(nome);
	}

	public String Voar() {
		return "�guia levantando voo";
	}

	@Override
	public String Respirar() {
		return "�guia respirando";
	}

	@Override
	public String Dormir() {
		return "�guia dormindo";
	}

	@Override
	public String Comer() {
		return "�guia comendo";
	}

	@Override
	public String Andar() {
		return "�guia andando";
	}
}