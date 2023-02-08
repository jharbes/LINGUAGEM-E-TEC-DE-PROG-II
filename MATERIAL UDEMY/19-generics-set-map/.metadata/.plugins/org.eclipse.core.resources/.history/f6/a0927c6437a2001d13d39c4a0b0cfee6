package model.application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		PrintService ps = new PrintService();

		System.out.print("Quantos valores deseja inserir? ");
		int n = teclado.nextInt();

		for (int i = 0; i < n; i++) {
			int value = teclado.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println("Primeiro: " + ps.first());
	}

}
