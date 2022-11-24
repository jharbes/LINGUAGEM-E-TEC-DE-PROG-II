import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Digite a ordem da matriz: ");
		int n=teclado.nextInt();
		int matriz[][]=new int[n][n];
		int somaNegativos=0;
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=teclado.nextInt();
				if (matriz[i][j]<0)
					somaNegativos++;
			}
		}
		
		System.out.println();
		System.out.println("Main diagonal:");
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				if (i==j)
					System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.println();
		
		System.out.print("Negative numbers = "+somaNegativos);
		
		teclado.close();
	}

}
