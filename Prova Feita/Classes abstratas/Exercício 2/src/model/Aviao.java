package model;

public class Aviao extends Veiculo {
	public String registro_aeronautico;

	public Aviao(String registro_aeronautico) {
		super();
		this.registro_aeronautico = registro_aeronautico;
	}
	
	@Override
	public String Ligar() {
		return "Avi�o ligando";
	}
	@Override
	public String Desligar() {
		return "Avi�o desligando";
	}
	@Override
	public String MoverFrente() {
		return "Avi�o movendo para frente";
	}
	@Override
	public String MoverRe() {
		return "Avi�o pra tr�s";
	}
	@Override
	public String Parar() {
		return "Avi�o parando";
	}
}
