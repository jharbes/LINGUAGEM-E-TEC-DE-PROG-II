import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int codPeca1,numPeca1,codPeca2,numPeca2;
		float valorPeca1,valorPeca2;
		
		System.out.println("Digite o c�digo da pe�a1: ");
		codPeca1=teclado.nextInt();
		
		System.out.println("Digite a quantidade de pe�a1: ");
		numPeca1=teclado.nextInt();
		
		System.out.println("Digite o valor unit�rio da pe�a1: ");
		valorPeca1=teclado.nextFloat();
		
		System.out.println("Digite o c�digo da pe�a2: ");
		codPeca2=teclado.nextInt();
		
		System.out.println("Digite a quantidade de pe�a2: ");
		numPeca2=teclado.nextInt();
		
		System.out.println("Digite o valor unit�rio da pe�a2: ");
		valorPeca2=teclado.nextFloat();
		
		System.out.printf("O valor total a pagar � de R$%.2f.",numPeca1*valorPeca1+numPeca2*valorPeca2);
	}

}
