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
		System.out.println("| Bem vindo ao jogo de adivinhação |");
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
		
		while(!ganhou) {
			System.out.printf("\nInsira um número entre "+min+" e "+max+" para tentar adivinhar o número sorteado: ");
			adivinhacao = ler.nextInt();
			tentativas++;
			
			if(adivinhacao == num_aleatorio ) {
				if(tentativas==1) System.out.println("\n**VOCÊ É EXCELENTE**\nConseguiu acertar em "+tentativas+" tentativa\nNúmero sorteado: "+num_aleatorio);
				else if(tentativas<=10) System.out.println("\n**VOCÊ É BOM**\nConseguiu acertar em "+tentativas+" tentativas\nNúmero sorteado: "+num_aleatorio);
				else if(tentativas>10 && tentativas<=20) System.out.println("\n**VOCÊ NÃO FOI TÃO BEM**\nConseguiu acertar em "+tentativas+" tentativas\nNúmero sorteado: "+num_aleatorio);
				else System.out.println("\n**VOCÊ PRECISA PRATICAR**\nConseguiu acertar em "+tentativas+" tentativas\nNúmero sorteado: "+num_aleatorio);
				
				ganhou = true;
				continue;
			}else {
				if(adivinhacao>num_aleatorio) {
					max = adivinhacao;
					System.out.println("\nVocê errou, o número sorteado é MENOR.\nTente novamente");
				}else {
					min = adivinhacao;
					System.out.println("\nVocê errou, o número sorteado é MAIOR.\nTente novamente");
				}
			}
		}
		System.out.println("\n\nPrograma encerrado.");
	}
}