import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n=teclado.nextInt();
		
		float vetor[]=new float[n];
		float somaElementos=0;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i]=teclado.nextFloat();
			somaElementos+=vetor[i];
		}
		
		System.out.printf("%nM�DIA DO VETOR = %.3f%n",somaElementos/vetor.length);
		
		System.out.println("ELEMENTOS ABAIXO DA M�DIA:");
		for (int i=0;i<vetor.length;i++) 
			if (vetor[i]<somaElementos/vetor.length)
				System.out.println(vetor[i]);
		
		teclado.close();
	}

}
