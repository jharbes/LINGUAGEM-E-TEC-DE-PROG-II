package controller;
import model.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro();
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int op;
		do {
			mostrar_menu(c);
			op = ler.nextInt();
			switch (op) {
			case 1: c.direita();
				break;
			case 2: c.esquerda();
				break;
			case 3: c.cima();
				break;
			case 4: c.baixo();
				break;
			case 5: c.acelerar();
				break;
			case 6: c.frear();
				break;
			case 7: c.girar_180graus(c);
				break;
			case 0:
				System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+");
				System.out.println("|       PROGRAMA ENCERRADO        |");
				System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+\n");
				break;
			default:
				System.out.println("\n+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+");
				System.out.println("|         OPÇÃO INVÁLIDA          |");
				System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+\n");
				try { Thread.sleep (2000); } catch (InterruptedException ex) {}
				break;
			}
		}while(op!=0);
	}
	
	public static void mostrar_menu(Carro c) {
		System.out.println("\nInforme o que deseja fazer com o carro\n");
		
		System.out.println("1 - Mover para direira\t\t5 - Acelerar");
		System.out.println("2 - Mover para a esquerda\t6 - Frear");
		System.out.println("3 - Mover para cima\t\t7 - Girar em 180°");
		System.out.println("4 - Mover para baixo\t\t0 - Encerrar");
		System.out.println("\n---------------------------------------------------");
		c.mostra_carro(c);
		System.out.println("---------------------------------------------------");
		if(c.acelerar==1) {
			System.out.println("O CARRO FOI ACELERADO");
		}else if(c.frear==1){
			System.out.println("O CARRO FOI FREADO");
		}
		System.out.printf("Digite o número da operação desejada: ");
	}
}