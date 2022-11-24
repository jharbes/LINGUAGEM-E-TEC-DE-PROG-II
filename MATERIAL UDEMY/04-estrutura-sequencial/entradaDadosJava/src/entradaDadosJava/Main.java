package entradaDadosJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char w;
		
		System.out.print("Digite o valor da string X: ");
		x=teclado.next(); // String usar next()
		
		System.out.print("Digite o valor do inteiro Y: ");
		y=teclado.nextInt(); // Valor inteiro usar nextInt()
		
		System.out.print("Digite o valor real de Z: ");
		z=teclado.nextDouble();
		
		System.out.println("Digite um char: ");
		w=teclado.next().charAt(0);
		
		System.out.println("O valor digitado é "+x+" e o número é "+y+" número flutuante é "+z);
		System.out.println("Fim do Programa");
		
		teclado.close();
	}

}
