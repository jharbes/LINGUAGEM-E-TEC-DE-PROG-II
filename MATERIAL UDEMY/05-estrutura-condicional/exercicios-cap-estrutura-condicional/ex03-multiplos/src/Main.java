import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Digite o valor de A: ");
		a=teclado.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b=teclado.nextInt();
		
		System.out.println(a>=b?a%b==0?"S�o M�ltiplos":"N�o s�o m�ltiplos":b%a==0?"S�o M�ltiplos":"N�o s�o m�ltiplos");
	}

}
