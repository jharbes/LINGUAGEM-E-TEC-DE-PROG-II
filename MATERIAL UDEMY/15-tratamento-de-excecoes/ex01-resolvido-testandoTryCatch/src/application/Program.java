package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada!");
		}

		System.out.println("End of program");
		teclado.close();
	}

}
