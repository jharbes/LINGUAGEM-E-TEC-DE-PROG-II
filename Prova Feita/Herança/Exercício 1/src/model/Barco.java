package model;

public class Barco extends Veiculo {
	public String registro_embarcacao;
	
	public Barco(boolean ligado, boolean movimentando, String registro_embarcacao) {
		super(ligado, movimentando);
		this.registro_embarcacao = registro_embarcacao;
	}

	public boolean Navegar() {
		if(this.ligado && this.movimentando) return true;
		else return false;
	}
	
	public void Ancorar() {
		this.movimentando = false;
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