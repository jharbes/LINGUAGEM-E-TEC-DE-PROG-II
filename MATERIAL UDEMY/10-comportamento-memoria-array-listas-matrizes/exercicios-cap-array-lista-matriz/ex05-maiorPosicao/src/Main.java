import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n=teclado.nextInt();
		
		double vetor[]=new double[n];
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um número: ");
			vetor[i]=teclado.nextDouble();
		}
		
		System.out.println();
		double maiorValor=vetor[0];
		int posicaoMaior=0;
		
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]>maiorValor) {
				maiorValor=vetor[i];
				posicaoMaior=i;
			}
		}
		
		System.out.println("MAIOR VALOR = "+maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = "+posicaoMaior);
		
		teclado.close();
	}
	
}
