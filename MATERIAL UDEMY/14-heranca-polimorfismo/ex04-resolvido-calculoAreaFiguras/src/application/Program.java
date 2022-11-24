package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		List<Shape> list=new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		Integer numeroFormas=teclado.nextInt();
		
		for (int i=1;i<=numeroFormas;i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char tipoForma=teclado.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String corForma=teclado.next();
			
			if (tipoForma=='r') {
				System.out.print("Width: ");
				Double width=teclado.nextDouble();
				
				System.out.print("Height: ");
				Double height=teclado.nextDouble();
				
				list.add(new Rectangle(Color.valueOf(corForma), width, height));
			} 
			else {
				System.out.print("Radius: ");
				Double radius=teclado.nextDouble();
				
				list.add(new Circle(Color.valueOf(corForma), radius));
			}
		}
		
		System.out.println("\nSHAPE AREAS:");
		
		for (Shape forma:list) {
			System.out.println(String.format("%.2f",forma.area()));
		}
		
		teclado.close();
	}

}
