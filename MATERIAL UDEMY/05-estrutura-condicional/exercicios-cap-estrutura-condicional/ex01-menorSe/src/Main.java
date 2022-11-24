import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int x;
		
		System.out.print("Informe um número inteiro: ");
		x=teclado.nextInt();
		System.out.println();
		
		System.out.println(x>=0?"POSITIVO":"NEGATIVO");
	}

}
