package model;

public class Quarto {
	public boolean lampada;
	public boolean abajour;
	public int ventilador; // 0 = desligado 
	public boolean ar_condicionado;
	public int temperatura;
	public int televisao; // canal 0 a televis�o est� desligada 
	
	public Quarto() {
		super();
	}
	
	public void ligar_lampada() {
		if(this.lampada) 
			System.out.println("\nA L�MPADA J� EST� ACESA.\n");
		else{
			System.out.println("\nA L�MPADA FOI ACESA.\n");
			this.lampada = true;
		}
	}
	
	public void desligar_lampada() {
		if(!this.lampada) System.out.println("\nA L�MPADA J� EST� APAGADA.\n");
		else {
			System.out.println("\nA L�MPADA FOI APAGADA.\n");
			this.lampada = false;
		}
	}
	
	public void ligar_abajour() {
		if(this.abajour) System.out.println("\nO ABAJOUR J� EST� LIGADO.\n");
		else {
			System.out.println("\nO ABAJOUR FOI LIGADO.\n");
			this.abajour = true;
		}
	}
	
	public void desligar_abajour() {
		if(!this.abajour) System.out.println("\nO ABAJOUR J� EST� DESLIGADO.\n");
		else {
			System.out.println("\nO ABAJOUR FOI DESLIGADO.\n");
			this.abajour = false;
		}
	}
	
	public void liga_ou_desliga_ventilador(int velocidade) {
		this.ventilador = velocidade;
	}
	
	public void liga_ou_desliga_arcondicionado(int temperatura) {
		if(temperatura>0) {
			this.ar_condicionado = true;
			this.temperatura = temperatura;
		}else 
			this.ar_condicionado = false;
		
	}
	
	public void liga_ou_desliga_televisao(int canal) {
		if(canal>0) 
			this.televisao = canal;
		else 
			this.televisao = 0;
	}
}