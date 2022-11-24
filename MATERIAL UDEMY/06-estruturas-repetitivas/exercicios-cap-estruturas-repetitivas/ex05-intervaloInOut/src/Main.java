import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int n,x;
		int in=0;
		int out=0;
		
		System.out.print("Digite o valor de N (número de valores a serem lidos em seguida): ");
		n=teclado.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.print("Digite o valor de número "+i+": ");
			x=teclado.nextInt();
			if (x>=10 && x<=20)
				in++;
			else
				out++;
		}
		
		System.out.println(in+" in");
		System.out.println(out+" out");
	}

}
