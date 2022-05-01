package controller;
import java.util.Random;
import java.util.Scanner;

public class Exercício_6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		int adivinhacao, max=100, min=0, num_aleatorio = gerador.nextInt(101);
		boolean ganhou=false;
		
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
		System.out.println("| Bem vindo ao jogo de adivinhação |");
		System.out.println("+-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
		
		while(!ganhou) {
			System.out.println("\nInsira um número entre "+min+" e "+max+" para tentar adivinhar o número aleatório: ");
			adivinhacao = ler.nextInt();
			
			if(adivinhacao == num_aleatorio ) {
				System.out.println("\n**VOCÊ GANHOU**\nNúmero sorteado: "+num_aleatorio);
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