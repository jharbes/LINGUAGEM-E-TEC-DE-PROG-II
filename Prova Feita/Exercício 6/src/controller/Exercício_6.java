package controller;
import java.util.Random;
import java.util.Scanner;

public class Exerc�cio_6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		int adivinhacao, max=100, min=0, num_aleatorio = gerador.nextInt(101);
		boolean ganhou=false;
		
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
		System.out.println("| Bem vindo ao jogo de adivinha��o |");
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
		
		while(!ganhou) {
			System.out.println("\nInsira um n�mero entre "+min+" e "+max+" para tentar adivinhar o n�mero aleat�rio: ");
			adivinhacao = ler.nextInt();
			
			if(adivinhacao == num_aleatorio ) {
				System.out.println("\n**VOC� GANHOU**\nN�mero sorteado: "+num_aleatorio);
				ganhou = true;
				continue;
			}else {
				if(adivinhacao>num_aleatorio) {
					max = adivinhacao;
					System.out.println("\nVoc� errou, o n�mero sorteado � MENOR.\nTente novamente");
				}else {
					min = adivinhacao;
					System.out.println("\nVoc� errou, o n�mero sorteado � MAIOR.\nTente novamente");
				}
			}
		}
		System.out.println("\n\nPrograma encerrado.");
	}
}