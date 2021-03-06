package model;

public class Automovel extends Veiculo {
	public int renavam;
	public String placa;

	public Automovel(boolean ligado, boolean movimentando, int renavam, String placa) {
		super(ligado, movimentando);
		this.renavam = renavam;
		this.placa = placa;
	}

	public void Frear() {
		this.movimentando = false;
	}
	
	public boolean PassarMarcha() {
		if(this.movimentando && this.ligado) return true;
		else return false;
	}

	@Override
	public void Ligar() {
		this.ligado = true;
	}

	@Override
	public void Desligar() {
		this.ligado = false;
	}

	@Override
	public boolean MoverFrente() {
		if(this.ligado) {
			this.movimentando = true;
			return true;
		}else
			return false;
	}

	@Override
	public boolean MoverRe() {
		if(this.ligado) {
			this.movimentando = true;
			return true;
		}else
			return false;
	}
}