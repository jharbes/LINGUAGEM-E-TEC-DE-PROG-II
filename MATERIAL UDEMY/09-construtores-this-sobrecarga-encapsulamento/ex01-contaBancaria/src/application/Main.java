package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado=new Scanner(System.in);
		ContaBancaria c1;
		
		System.out.print("Enter account number: ");
		int contaNumero=teclado.nextInt();
		
		System.out.print("Enter account holder: ");
		teclado.nextLine();
		String nomeTitular=teclado.nextLine();
		
		System.out.print("Is there a initial deposit? ");
		char depInicial=teclado.next().charAt(0);
		
		if (depInicial=='Y' || depInicial=='y') {
			System.out.print("Enter initial deposit value: ");
			float depositoInicial=teclado.nextFloat();
			System.out.println();
			c1=new ContaBancaria(contaNumero, nomeTitular, depositoInicial);
			System.out.println();
		}
		else {
			c1=new ContaBancaria(contaNumero, nomeTitular);
			System.out.println();
		}
		
		System.out.print("Enter a deposit value: ");
		float deposito=teclado.nextFloat();
		c1.deposito(deposito);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		float saque=teclado.nextFloat();
		c1.saque(saque);
		
		teclado.close();
	}

}
