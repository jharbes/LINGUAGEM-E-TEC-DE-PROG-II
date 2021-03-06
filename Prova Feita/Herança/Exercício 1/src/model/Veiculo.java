package model;

public abstract class Veiculo {
	public boolean ligado = false;
	public boolean movimentando = false;
	
	public Veiculo(boolean ligado, boolean movimentando) {
		super();
		this.ligado = ligado;
		this.movimentando = movimentando;
	}
	
	public abstract void Ligar();
	public abstract void Desligar();
	public abstract boolean MoverFrente();
	public abstract boolean MoverRe();
}