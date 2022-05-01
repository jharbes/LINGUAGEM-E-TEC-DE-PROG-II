package model;

public class Automovel extends Veiculo {
	public String placa;
	public String renavam;
	
	public Automovel(String placa, String renavam) {
		super();
		this.placa = placa;
		this.renavam = renavam;
	}
	
	@Override
	public String Ligar() {
		return "Automóvel ligando";
	}
	@Override
	public String Desligar() {
		return "Automóvel desligando";
	}
	@Override
	public String MoverFrente() {
		return "Automóvel movendo pra frente";
	}
	@Override
	public String MoverRe() {
		return "Automóvel pra trás";
	}
	@Override
	public String Parar() {
		return "Automóvel parando";
	}
}