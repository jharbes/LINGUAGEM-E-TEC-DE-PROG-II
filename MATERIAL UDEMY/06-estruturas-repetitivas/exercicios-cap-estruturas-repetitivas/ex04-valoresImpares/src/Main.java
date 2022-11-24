import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int x;
		
		System.out.print("Digite o valor de X inteiro (1<=X<=1000): ");
		x=teclado.nextInt();
		
		if (x>=1 && x<=1000) {
			for (int i=1;i<=x;i++) {
				if (i%2!=0)
					System.out.println(i);
			}
		}
		else
			System.out.println("Valor de X inválido, operação cancelada.");
	}

}
