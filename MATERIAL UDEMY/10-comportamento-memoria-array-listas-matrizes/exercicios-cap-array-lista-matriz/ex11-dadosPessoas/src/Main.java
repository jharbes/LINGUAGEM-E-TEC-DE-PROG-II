import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n=teclado.nextInt();
		
		Pessoa vetor[]=new Pessoa[n];
		
		char genero;
		float altura;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.printf("Altura da %da pessoa: ",i+1);
			altura=teclado.nextFloat();
			System.out.printf("Genero da %da pessoa: ",i+1);
			genero=teclado.next().charAt(0);
			vetor[i]=new Pessoa(genero,altura);
		}
		
		float menorAltura=vetor[0].getAltura();
		float maiorAltura=vetor[0].getAltura();
		
		float somaAlturaMulher=0;
		int somaQuantidadeMulher=0;
		int somaQuantidadeHomem=0;
		
		for (int i=0;i<vetor.length;i++) {
			if (menorAltura>vetor[i].getAltura())
				menorAltura=vetor[i].getAltura();
			if (maiorAltura<vetor[i].getAltura())
				maiorAltura=vetor[i].getAltura();
			if (vetor[i].getGenero()=='F' || vetor[i].getGenero()=='f') {
				somaAlturaMulher+=vetor[i].getAltura();
				somaQuantidadeMulher++;
			}else if (vetor[i].getGenero()=='M' || vetor[i].getGenero()=='m')
				somaQuantidadeHomem++;
		}
		
		System.out.println("Menor altura = "+menorAltura);
		System.out.println("Maior altura = "+maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n",(float)somaAlturaMulher/somaQuantidadeMulher);
		System.out.println("Número de homens = "+somaQuantidadeHomem);
		
		teclado.close();
	}

}
