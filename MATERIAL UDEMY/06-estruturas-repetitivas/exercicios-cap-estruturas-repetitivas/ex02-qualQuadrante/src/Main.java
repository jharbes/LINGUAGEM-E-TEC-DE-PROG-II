import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		float x,y;
		
		System.out.println("Digite o valor da coordenada X:");
		x=teclado.nextFloat();
		System.out.println("Digite o valor da coordenada Y:");
		y=teclado.nextFloat();
		
		while(x!=0 && y!=0) {
			if (x>0 && y>0)
				System.out.println("primeiro");
			else if (x>0 && y<0)
				System.out.println("quarto");
			else if (x<0 && y>0)
				System.out.println("segundo");
			else if (x<0 && y<0)
				System.out.println("terceiro");

			System.out.println("Digite o valor da coordenada X:");
			x=teclado.nextFloat();
			System.out.println("Digite o valor da coordenada Y:");
			y=teclado.nextFloat();
		}
	}

}
