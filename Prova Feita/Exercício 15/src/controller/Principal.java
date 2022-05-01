package controller;
import model.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int continua;
		
		System.out.println("\nInstancie objetos da classe Célula para depois ser mostrado a quantidade gerada.\n");
		
		do {
			System.out.printf("Deseja instanciar mais um objeto [1] Sim [0] Não? ");
			continua = ler.nextInt();
			
			if(continua!=0) new Célula();
		}while(continua!=0);
		
		System.out.println("\n\nForam geradas "+Célula.contador+" instancias da classe Célula");
	}
}