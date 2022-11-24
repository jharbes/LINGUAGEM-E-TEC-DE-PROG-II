import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Digite o valor de N para calcular seu fatorial: ");
		int n=teclado.nextInt();
		int fatorial=1;
		
		if(n>=0) {
			while(n!=0) 
				fatorial*=n--;
			System.out.println("Valor do fatorial: "+fatorial);
		}
		else {
			System.out.println("Valor de N inválido");
		}
		
	}

}
