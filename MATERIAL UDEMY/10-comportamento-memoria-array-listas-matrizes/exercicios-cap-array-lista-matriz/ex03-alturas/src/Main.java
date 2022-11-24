import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n=teclado.nextInt();
		
		Pessoa vetor[]=new Pessoa[n];
		
		String nome;
		int idade;
		float altura;
		
		int menor16=0;
		float somaAltura=0;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.printf("Dados da %da pessoa:%n",i+1);
			System.out.print("Nome: ");
			teclado.nextLine();
			nome=teclado.nextLine();
			System.out.print("Idade: ");
			idade=teclado.nextInt();
			System.out.print("Altura: ");
			altura=teclado.nextFloat();
			vetor[i]=new Pessoa(nome,idade,altura);
			somaAltura+=altura;
			if (idade<16)
				menor16++;
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n",somaAltura/vetor.length);
		float pessoasMenor16=((float)menor16/vetor.length)*100;
		System.out.print("Pessoas com menos de 16 anos: ");
		System.out.println(pessoasMenor16+"%");
		
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i].getIdade()<16)
				System.out.println(vetor[i].getNome());
		}
	}

}
