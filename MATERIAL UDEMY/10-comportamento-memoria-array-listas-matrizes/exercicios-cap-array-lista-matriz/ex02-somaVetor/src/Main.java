import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n=teclado.nextInt();
		
		float vetor[]=new float[n];
		float soma=0;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um número: ");
			vetor[i]=teclado.nextFloat();
			soma+=vetor[i];
		}
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i=0;i<vetor.length;i++)
			System.out.print(vetor[i]+" ");
		System.out.println();
		
		System.out.println("SOMA = "+String.format("%.2f",soma));
		System.out.printf("MÉDIA = %.2f%n",soma/vetor.length);
		
		teclado.close();
	}

}
