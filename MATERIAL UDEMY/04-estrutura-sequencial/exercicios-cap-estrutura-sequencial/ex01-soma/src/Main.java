import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("Digite o valor do primeiro inteiro: ");
		x=teclado.nextInt();
		System.out.println();
		System.out.print("Digite o valor do segundo inteiro: ");
		y=teclado.nextInt();
		System.out.println();
		
		System.out.printf("O valor da soma dos dois números informados é %d",x+y);
		
	}

}
