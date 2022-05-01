package model;

public class Barco extends Veiculo {
	public String registro_embarcacao;

	public Barco(String registro_embarcacao) {
		super();
		this.registro_embarcacao = registro_embarcacao;
	}
	
	@Override
	public String Ligar() {
		return "Barco ligando";
	}
	@Override
	public String Desligar() {
		return "Barco desligando";
	}
	@Override
	public String MoverFrente() {
		return "Barco movendo pra frente";
	}
	@Override
	public String MoverRe() {
		return "Barco movendo pra trás";
	}
	@Override
	public String Parar() {
		return "Barco parando";
	}
}