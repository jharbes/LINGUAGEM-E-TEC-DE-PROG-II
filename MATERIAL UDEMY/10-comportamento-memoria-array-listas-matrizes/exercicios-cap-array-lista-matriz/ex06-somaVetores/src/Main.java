import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n=teclado.nextInt();
		
		int vetorA[]=new int[n];
		int vetorB[]=new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i=0;i<vetorA.length;i++)
			vetorA[i]=teclado.nextInt();
		
		System.out.println("Digite os valores do vetor B:");
		for (int i=0;i<vetorB.length;i++)
			vetorB[i]=teclado.nextInt();
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0;i<vetorB.length;i++)
			System.out.printf("%d%n",vetorA[i]+vetorB[i]);
		
		
		teclado.close();
	}

}
