package model;

public class Aviao extends Veiculo {
	public String registro_aeronautico;
	
	public Aviao(boolean ligado, boolean movimentando, String registro_aeronautico) {
		super(ligado, movimentando);
		this.registro_aeronautico = registro_aeronautico;
	}

	public boolean Decolar() {
		if(this.ligado && this.movimentando) return true;
		else return false;
	}
	
	public void Pousar() {
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