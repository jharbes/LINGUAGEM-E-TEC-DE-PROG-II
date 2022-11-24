package application;

import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Retangulo r1=new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		r1.altura=teclado.nextDouble();
		r1.largura=teclado.nextDouble();
		
		r1.calculosTriangulo();
	}

}
