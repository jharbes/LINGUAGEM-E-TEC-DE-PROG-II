import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Digite o número de linhas da matriz: ");
		int m=teclado.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		int n=teclado.nextInt();
		
		int[][] matriz=new int[m][n];
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++)
				matriz[i][j]=teclado.nextInt();
		}
		
		System.out.print("Digite a ocorrência X: ");
		int x=teclado.nextInt();
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++)
				if (matriz[i][j]==x) {
					System.out.println("Position "+i+","+j+":");
					if (j-1>=0)
						System.out.println("Left: "+matriz[i][j-1]);
					if (i-1>=0)
						System.out.println("Up: "+matriz[i-1][j]);
					if (j+1<matriz[i].length)
						System.out.println("Right: "+matriz[i][j+1]);
					if (i+1<matriz.length)
						System.out.println("Down: "+matriz[i+1][j]);
				}
		}
		
		teclado.close();
	}

}
