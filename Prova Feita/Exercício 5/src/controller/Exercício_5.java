package controller;
import java.util.Scanner;
import java.util.Random;

public class Exerc�cio_5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		int adivinhacao, num_aleatorio = gerador.nextInt(101);
		
		System.out.println("Insira um n�mero para tentar adivinhar o n�mero gerado: ");
		adivinhacao = ler.nextInt();
		
		if(adivinhacao == num_aleatorio ) System.out.println("\nVoc� acertou o n�mero\nN�mero sorteado: "+num_aleatorio);
		else System.out.println("\nVoc� errou\nN�mero sorteado: "+num_aleatorio);
		
		System.out.println("\n\nPrograma encerrado.");
	}
}