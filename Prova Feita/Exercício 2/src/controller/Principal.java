package controller;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.printf("Informe a primeira nota para retornar a situação de aprovação do aluno: ");
		nota1 = ler.nextFloat();
		
		System.out.printf("Informe a segunda segunda: ");
		nota2 = ler.nextFloat();
		
		while( nota1>10 || nota1<0 || nota2>10 || nota2<0 ){
			
			System.out.println("\n\nAs notas estão inválidas\nInsira notas entre 0 e 10\n\n");
			System.out.println("Informe a primeira nota: ");
			nota1 = ler.nextFloat();
			
			System.out.printf("Informe a segunda segunda: ");
			nota2 = ler.nextFloat();
		}
		
		media = (nota1 + nota2) / 2;
		
		if(media>=6) System.out.println("\nO aluno está aprovado.");
		else if (media<2) System.out.println("\nO aluno está reprovado, pois sua média é menor que 2.");
		else{
			float notapf, mediapf;
			System.out.printf("\nA média do aluno o enquadra na situação de prova final.\n\nInforme a nota da sua prova final: ");
			notapf = ler.nextFloat();
			
			mediapf = (nota1 + nota2 + notapf) / 3;
			if (mediapf>6) System.out.println("\nApós a prova final, o aluno foi aprovado.");
			else System.out.println("\nMesmo após a prova final, o aluno ficou reprovado, pois não conseguiu média 6.");
		}
		
		System.out.println("\n\nPrograma encerrado.");
	}
}