import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n=teclado.nextInt();
		
		int vetor[]=new int[n];
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um número: ");
			vetor[i]=teclado.nextInt();
		}
		
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]<0) {
				System.out.println("NÚMEROS NEGATIVOS:");
				break;
			}
		}
		
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]<0)
				System.out.println(vetor[i]);
		}
		
	}

}
