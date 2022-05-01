package controller;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		float delta, x1, x2;
		
		System.out.printf("Informe o coeficiente A: ");
		a = ler.nextInt();
		
		System.out.printf("\nInforme o coeficiente B: ");
		b = ler.nextInt();
		
		System.out.printf("\nInforme o coeficiente C: ");
		c = ler.nextInt();
		
		delta = (b * b) + (-4 * (a * c));
		
		if(delta<0) System.out.println("\n\nA equação não possui raízes.");
		else if(delta==0) {
			x1 = (float) ((-(b) + Math.sqrt(delta)) / 2 * a);
			System.out.println("\n\nA equação possui uma raíz real: "+x1);
		}else {
			x1 = (float) ((-(b) + Math.sqrt(delta)) / 2 * a);
	        x2 = (float) ((-(b) - Math.sqrt(delta)) / 2 * a);
	        System.out.println("\n\nA equação possui duas raízes reais iguais, X1 ("+x1+") e X2 ("+x2+")");
		}
		
		System.out.println("\n\nPrograma encerrado.");
	}
}