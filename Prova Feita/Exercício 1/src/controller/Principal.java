package controller;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float media, media2, mediafinal;
			
		System.out.printf("Informe a primeira m�dia: ");
		media = ler.nextFloat();
			
		System.out.printf("Informe a segunda m�dia: ");
		media2 = ler.nextFloat();
			
		mediafinal = (media + media2) / 2;
		
		System.out.println("\nA m�dia final � "+mediafinal+
					"\nE adotando como padr�o a nota 5 a m�dia final, o aluno se encontra ");
			
		System.out.println((mediafinal < 5) ? "reprovado": "aprovado");
		
		System.out.println("\n\nPrograma encerrado.");
	}
}