import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.println("Digite o valor de A: ");
		a=teclado.nextInt();
		System.out.println("Digite o valor de B: ");
		b=teclado.nextInt();
		System.out.println("Digite o valor de C: ");
		c=teclado.nextInt();
		System.out.println("Digite o valor de D: ");
		d=teclado.nextInt();
		
		System.out.print("A diferença do produto (A*B-C*D) é igual a: ");
		System.out.println(a*b-c*d);
	}

}
