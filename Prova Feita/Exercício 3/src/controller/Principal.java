package controller;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, maior;
		
		System.out.printf("Informe o primeiro número: ");
		n1 = ler.nextFloat();
		
		System.out.printf("Informe o segundo número: ");
		n2 = ler.nextFloat();
		
		System.out.printf("Informe o terceiro número: ");
		n3 = ler.nextFloat();
		
		if(n1>n2 && n1>n3) maior = n1;
		else if (n2>n3) maior = n2;
		else maior = n3;
		
		System.out.println("\nMaior número: "+maior);
		
		System.out.println("\n\nPrograma encerrado.");
	}
}