package controller;
import model.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int op;
		String palavra;
		
		do {
			mostrar_menu();
			op = ler.nextInt();
			switch(op) {
				case 1:
					System.out.printf("\nInforme a palavra ou frase a ser ENCRIPTADA: ");
					ler.nextLine();
					palavra = ler.nextLine();
					Cryptographye.encrypt(palavra);
					System.out.println();
					break;
				case 2:
					System.out.printf("\nInforme a palavra ou frase a ser DESENCRIPTADA: ");
					ler.nextLine();
					palavra = ler.nextLine();
					Cryptographye.decrypt(palavra);
					System.out.println();
					break;
				case 0:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|     PROGRAMA ENCERRADO     |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
				default:
					System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
					System.out.println("|       OPÇÃO INVÁLIDA       |");
					System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=+\n");
					break;
			}
		}while(op!=0);
	}
	
	public static void mostrar_menu() {
		System.out.println("+----------------------------+");
		System.out.println("|    Criptografia de César   |");
		System.out.println("+----------------------------+\n");
		System.out.println("1 - Encriptar.");
		System.out.println("2 - Desencriptar.");
		System.out.println("0 - Sair do programa.");
		System.out.printf("\nInforme uma opção: ");
	}
}