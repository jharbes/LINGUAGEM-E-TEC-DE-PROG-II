package controller;
import model.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe a medida da base do retangulo (m): ");
		ret.setBase(ler.nextFloat());
		System.out.printf("\nInforme a medida da altura do retangulo (cm): ");
		ret.setAltura(ler.nextFloat());
		
		System.out.println("\n\nPer�metro do ret�ngulo: "+ret.calcula_perimetro()+" cm");
		System.out.println("\n�rea do ret�ngulo: "+ret.calcula_area()+" cm�");
	}
}