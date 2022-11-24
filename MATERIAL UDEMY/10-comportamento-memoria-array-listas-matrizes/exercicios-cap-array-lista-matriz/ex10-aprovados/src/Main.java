import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n=teclado.nextInt();
		
		Aluno vetor[]=new Aluno[n];
		
		String nome;
		float notaSemestre1,notaSemestre2;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n",i+1);
			teclado.nextLine();
			nome=teclado.nextLine();
			notaSemestre1=teclado.nextFloat();
			notaSemestre2=teclado.nextFloat();
			vetor[i]=new Aluno(nome,notaSemestre1,notaSemestre2);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i=0;i<vetor.length;i++) {
			if ((vetor[i].getNotaSemestre1()+vetor[i].getNotaSemestre2())/2>=6.0)
				System.out.println(vetor[i].getNome());
		}
		
		teclado.close();
	}

}
