package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();

		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("***METHOD1 START***\n");

		method2();

		System.out.println("***METHOD1 END***\n");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***\n");
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Entre com os elementos do vetor, separados por espaço em branco:");
			String vetor[] = teclado.nextLine().split(" "); // Estamos utilizando esse comando para ler um vetor de
															// strings
															// onde em cada espaço que for dado entre as palavras sera
															// um
															// novo elemento do vetor
			System.out.print("\nEntre com a posição desejada do vetor para imprimir o elemento: ");
			int position = teclado.nextInt();

			System.out.println(vetor[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");

			e.printStackTrace(); // Imprime na tela o rastreamento do stack

			teclado.next(); // comando apenas para que o sistema fique em aguardo ate que alguma letra ou
							// numero seja digitado e o enter seja acionado
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada!");
		}
		teclado.close();
		System.out.println("\n***METHOD2 END***");
	}
}
