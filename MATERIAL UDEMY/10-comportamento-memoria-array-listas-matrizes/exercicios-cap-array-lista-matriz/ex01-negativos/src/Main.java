import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		int n=teclado.nextInt();
		
		int vetor[]=new int[n];
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i]=teclado.nextInt();
		}
		
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]<0) {
				System.out.println("N�MEROS NEGATIVOS:");
				break;
			}
		}
		
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]<0)
				System.out.println(vetor[i]);
		}
		
	}

}
