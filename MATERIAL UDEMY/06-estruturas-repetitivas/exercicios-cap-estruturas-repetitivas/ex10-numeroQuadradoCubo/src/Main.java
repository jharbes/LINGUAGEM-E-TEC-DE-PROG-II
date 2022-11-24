import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Digite um inteiro positivo N para calcular seu quadrado e cubo: ");
		int n=teclado.nextInt();
		
		if (n>=0)
			for (int i=1;i<=n;i++)
				System.out.printf("%d %d %d%n",i,i*i,i*i*i);
		else
			System.out.println("Valor de N inválido");
		
		
		teclado.close();
	}

}
