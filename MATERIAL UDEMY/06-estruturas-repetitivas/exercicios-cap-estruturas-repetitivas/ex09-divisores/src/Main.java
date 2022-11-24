import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro positivo N: ");
		int n=teclado.nextInt();
		
		if (n>=0) {
			for (int i=1;i<=n;i++) {
				if (n%i==0)
					System.out.println(i);
			}
		}else {
			System.out.println("Valor de N inválido");
		}
	}

}
