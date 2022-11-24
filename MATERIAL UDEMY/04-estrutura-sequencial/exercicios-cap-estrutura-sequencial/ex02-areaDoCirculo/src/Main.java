import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		float r;
		
		System.out.print("Digite o valor do raio do círculo: ");
		
		r=teclado.nextFloat();
		
		System.out.println();
		System.out.printf("O valor da área do círculo é %.4f.",3.14159*r*r);
	}

}
