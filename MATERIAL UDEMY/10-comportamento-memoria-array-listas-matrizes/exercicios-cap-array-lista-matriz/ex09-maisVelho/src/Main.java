import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n=teclado.nextInt();
		
		String nome;
		int idade;
		Pessoa vetor[]=new Pessoa[n];
		int maiorIdade=0;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.printf("Dados da %da pessoa:%n",i+1);
			System.out.print("Nome: ");
			teclado.nextLine();
			nome=teclado.nextLine();
			System.out.print("Idade: ");
			idade=teclado.nextInt();
			vetor[i]=new Pessoa(nome,idade);
			if (idade>maiorIdade)
				maiorIdade=idade;
		}
		
		for (int i=0;i<vetor.length;i++)
			if (vetor[i].getIdade()==maiorIdade)
				System.out.println("PESSOA MAIS VELHA: "+vetor[i].getNome());
		
		teclado.close();
	}

}
