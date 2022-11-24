import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n=teclado.nextInt();
		
		int[] vetor=new int[n];
		
		int quantidadePares=0;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um número: ");
			vetor[i]=teclado.nextInt();
			if (vetor[i]%2==0)
				quantidadePares++;
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]%2==0)
				System.out.print(vetor[i]+" ");
		}
		System.out.printf("%n%n");
		
		System.out.print("QUANTIDADE DE PARES = "+quantidadePares);
	}

}
