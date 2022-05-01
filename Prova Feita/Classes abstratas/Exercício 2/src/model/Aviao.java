package model;

public class Aviao extends Veiculo {
	public String registro_aeronautico;

	public Aviao(String registro_aeronautico) {
		super();
		this.registro_aeronautico = registro_aeronautico;
	}
	
	@Override
	public String Ligar() {
		return "Avião ligando";
	}
	@Override
	public String Desligar() {
		return "Avião desligando";
	}
	@Override
	public String MoverFrente() {
		return "Avião movendo para frente";
	}
	@Override
	public String MoverRe() {
		return "Avião pra trás";
	}
	@Override
	public String Parar() {
		return "Avião parando";
	}
}
