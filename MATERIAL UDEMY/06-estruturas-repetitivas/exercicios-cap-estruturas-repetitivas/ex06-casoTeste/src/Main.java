import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite o número de casos de teste: ");
		n=teclado.nextInt();
		
		float vetor[]=new float[3];
		float media[]=new float[n];
		
		for (int i=0;i<n;i++) {
			for (int w=0;w<3;w++) {
				System.out.print("Digite o valor de ordem "+w+": ");
				vetor[w]=teclado.nextFloat();
			}
			media[i]=(vetor[0]*2+vetor[1]*3+vetor[2]*5)/10;
		}
		
		for (int i=0;i<n;i++)
			System.out.printf("%.1f %n",media[i]);
	}

}
