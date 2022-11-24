import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		float x,y;
		
		System.out.println("Digite o valor de X: ");
		x=teclado.nextFloat();
		
		System.out.println("Digite o valor de Y: ");
		y=teclado.nextFloat();
		
		if (x>0 && y>0)
			System.out.println("Q1");
		else if(x<0 && y>0)
			System.out.println("Q2");
		else if(x<0 && y<0)
			System.out.println("Q3");
		else if(x>0 && y<0)
			System.out.println("Q4");
		else if(x==0 && y==0)
			System.out.println("Origem");
		else if(x==0)
			System.out.println("Eixo Y");
		else
			System.out.println("Eixo X");
	}

}
