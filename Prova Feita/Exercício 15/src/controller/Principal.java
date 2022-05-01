package controller;
import model.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int continua;
		
		System.out.println("\nInstancie objetos da classe C�lula para depois ser mostrado a quantidade gerada.\n");
		
		do {
			System.out.printf("Deseja instanciar mais um objeto [1] Sim [0] N�o? ");
			continua = ler.nextInt();
			
			if(continua!=0) new C�lula();
		}while(continua!=0);
		
		System.out.println("\n\nForam geradas "+C�lula.contador+" instancias da classe C�lula");
	}
}