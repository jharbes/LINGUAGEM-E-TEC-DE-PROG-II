package model;

public class Lion extends Animal {

	public Lion(String nome) {
		super(nome);
	}

	@Override
	public String Respirar() {
		return "Le�o respirando";
	}

	@Override
	public String Dormir() {
		return "Le�o dormindo";
	}

	@Override
	public String Comer() {
		return "Le�o comendo";
	}

	@Override
	public String Andar() {
		return "Le�o andando";
	}
}