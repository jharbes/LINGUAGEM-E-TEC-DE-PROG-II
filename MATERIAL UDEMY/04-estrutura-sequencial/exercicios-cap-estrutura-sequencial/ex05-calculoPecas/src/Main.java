import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int codPeca1,numPeca1,codPeca2,numPeca2;
		float valorPeca1,valorPeca2;
		
		System.out.println("Digite o código da peça1: ");
		codPeca1=teclado.nextInt();
		
		System.out.println("Digite a quantidade de peça1: ");
		numPeca1=teclado.nextInt();
		
		System.out.println("Digite o valor unitário da peça1: ");
		valorPeca1=teclado.nextFloat();
		
		System.out.println("Digite o código da peça2: ");
		codPeca2=teclado.nextInt();
		
		System.out.println("Digite a quantidade de peça2: ");
		numPeca2=teclado.nextInt();
		
		System.out.println("Digite o valor unitário da peça2: ");
		valorPeca2=teclado.nextFloat();
		
		System.out.printf("O valor total a pagar é de R$%.2f.",numPeca1*valorPeca1+numPeca2*valorPeca2);
	}

}
