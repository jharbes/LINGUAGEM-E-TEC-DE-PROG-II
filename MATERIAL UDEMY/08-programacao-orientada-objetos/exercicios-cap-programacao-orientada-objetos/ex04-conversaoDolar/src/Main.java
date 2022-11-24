import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("What is de the dollar price? ");
		double price=teclado.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount=teclado.nextDouble();
		
		CurrencyConverter.convertingDollarReal(price,amount);
		
		teclado.close();
	}

}
