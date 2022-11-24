import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n=teclado.nextInt();
		
		int vetor[]=new int[n];
		int somaPares=0;
		int quantidadePares=0;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um número: ");
			vetor[i]=teclado.nextInt();
			if (vetor[i]%2==0) {
				somaPares+=vetor[i];
				quantidadePares++;
			}
		}
		
		if (somaPares!=0)
			System.out.printf("MÉDIA DOS PARES = %.1f%n",(float)somaPares/quantidadePares);
		else
			System.out.println("NENHUM NÚMERO PAR");
		
		teclado.close();
	}

}
