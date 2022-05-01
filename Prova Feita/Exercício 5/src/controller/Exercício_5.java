package controller;
import java.util.Scanner;
import java.util.Random;

public class Exercício_5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		int adivinhacao, num_aleatorio = gerador.nextInt(101);
		
		System.out.println("Insira um número para tentar adivinhar o número gerado: ");
		adivinhacao = ler.nextInt();
		
		if(adivinhacao == num_aleatorio ) System.out.println("\nVocê acertou o número\nNúmero sorteado: "+num_aleatorio);
		else System.out.println("\nVocê errou\nNúmero sorteado: "+num_aleatorio);
		
		System.out.println("\n\nPrograma encerrado.");
	}
}