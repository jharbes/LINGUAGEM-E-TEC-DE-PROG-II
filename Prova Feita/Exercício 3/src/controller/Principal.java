package controller;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, maior;
		
		System.out.printf("Informe o primeiro n�mero: ");
		n1 = ler.nextFloat();
		
		System.out.printf("Informe o segundo n�mero: ");
		n2 = ler.nextFloat();
		
		System.out.printf("Informe o terceiro n�mero: ");
		n3 = ler.nextFloat();
		
		if(n1>n2 && n1>n3) maior = n1;
		else if (n2>n3) maior = n2;
		else maior = n3;
		
		System.out.println("\nMaior n�mero: "+maior);
		
		System.out.println("\n\nPrograma encerrado.");
	}
}