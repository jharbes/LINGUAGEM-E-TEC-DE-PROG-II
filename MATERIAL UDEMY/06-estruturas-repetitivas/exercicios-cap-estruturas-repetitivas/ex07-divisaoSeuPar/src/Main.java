import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite o número de pares desejados para serem divididos: ");
		n=teclado.nextInt();
		
		float matriz[][]=new float[n][2];
		
		for (int i=0;i<n;i++) {
			System.out.println("Digite o novo par de valores:");
			System.out.print("Primeiro valor do par: ");
			matriz[i][0]=teclado.nextInt();
			System.out.print("Segundo valor do par: ");
			matriz[i][1]=teclado.nextInt();
		}
		
		for (int i=0;i<n;i++) {
			if (matriz[i][1]==0)
				System.out.println("Divisão impossível");
			else
				System.out.println(matriz[i][0]/matriz[i][1]);
		}
	}

}
