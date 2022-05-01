package controller;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		int adivinhacao, tentativas=0, max=100, min=0, num_aleatorio = gerador.nextInt(101);
		boolean ganhou=false;
		
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
		System.out.println("| Bem vindo ao jogo de adivinha��o |");
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
		
		while(!ganhou) {
			System.out.printf("\nInsira um n�mero entre "+min+" e "+max+" para tentar adivinhar o n�mero sorteado: ");
			adivinhacao = ler.nextInt();
			tentativas++;
			
			if(adivinhacao == num_aleatorio ) {
				if(tentativas==1) System.out.println("\n**VOC� � EXCELENTE**\nConseguiu acertar em "+tentativas+" tentativa\nN�mero sorteado: "+num_aleatorio);
				else if(tentativas<=10) System.out.println("\n**VOC� � BOM**\nConseguiu acertar em "+tentativas+" tentativas\nN�mero sorteado: "+num_aleatorio);
				else if(tentativas>10 && tentativas<=20) System.out.println("\n**VOC� N�O FOI T�O BEM**\nConseguiu acertar em "+tentativas+" tentativas\nN�mero sorteado: "+num_aleatorio);
				else System.out.println("\n**VOC� PRECISA PRATICAR**\nConseguiu acertar em "+tentativas+" tentativas\nN�mero sorteado: "+num_aleatorio);
				
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