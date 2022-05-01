package controller;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float media, media2, mediafinal;
			
		System.out.printf("Informe a primeira média: ");
		media = ler.nextFloat();
			
		System.out.printf("Informe a segunda média: ");
		media2 = ler.nextFloat();
			
		mediafinal = (media + media2) / 2;
		
		System.out.println("\nA média final é "+mediafinal+
					"\nE adotando como padrão a nota 5 a média final, o aluno se encontra ");
			
		System.out.println((mediafinal < 5) ? "reprovado": "aprovado");
		
		System.out.println("\n\nPrograma encerrado.");
	}
}