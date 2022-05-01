package model;

public class Carro {
	public int direita;
	public int baixo;
	
	public int acelerar = 0; // 1 acelerado, 0 soltou o acelerador
	public int frear = 0; // 1 foi freado, 0 soltou o freio
	public int orientacao = 1; // 1 - virado pra direita, 0 - virado pra esquerda
	public String carro = "Carro->";
	
	public Carro() {
		super();
	}
	
	public void direita() {
		this.direita = this.direita+1;
	}
	public void esquerda() {
		if(this.direita==0) {
			System.out.println("\n+-------------------------------------------------------+");
			System.out.println("| O carro está encostado na parede, ande para a direita |");
			System.out.println("+-------------------------------------------------------+\n");
			try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		}else 
			this.direita = this.direita-1;
	}
	public void baixo() {
		this.baixo = this.baixo+1;
	}
	public void cima() {
		if(this.baixo==0) {
			System.out.println("\n+------------------------------------------------------+");
			System.out.println("| O carro está encostado na parede, ande para a baixo  |");
			System.out.println("+------------------------------------------------------+\n");
			try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		}else
			this.baixo = this.baixo-1;
	}
	
	public void acelerar() {
		if(this.acelerar==1) this.acelerar = 0;
		else this.acelerar = 1;
		this.frear = 0;
	}
	public void frear() {
		if(this.frear==1) this.frear = 0;
		else this.frear = 1;
		this.acelerar = 0;
	}
	public void girar_180graus(Carro c) {
		if(this.orientacao==1) {
			this.orientacao=0;
			this.carro = "<-Carro";
		}else {
			this.orientacao=1;
			this.carro = "Carro->";
		}
	}
	
	public void mostra_carro(Carro c) {
		String aux_horizontal="", aux_vertical="";
		
		for(int i=0; i < this.direita; i++) aux_horizontal = aux_horizontal + "   ";
		for(int i=0; i < this.baixo; i++) aux_vertical = aux_vertical + "\n";
			
		System.out.println(aux_vertical+aux_horizontal+this.carro);
	}
}