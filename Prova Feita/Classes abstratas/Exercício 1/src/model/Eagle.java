package model;

public class Eagle extends Animal {
	
	public Eagle(String nome) {
		super(nome);
	}

	public String Voar() {
		return "Águia levantando voo";
	}

	@Override
	public String Respirar() {
		return "Águia respirando";
	}

	@Override
	public String Dormir() {
		return "Águia dormindo";
	}

	@Override
	public String Comer() {
		return "Águia comendo";
	}

	@Override
	public String Andar() {
		return "Águia andando";
	}
}