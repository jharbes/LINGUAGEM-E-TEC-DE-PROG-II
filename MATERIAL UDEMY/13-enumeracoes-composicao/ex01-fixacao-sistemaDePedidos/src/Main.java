import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name=teclado.nextLine();
		
		System.out.print("Email: ");
		String email=teclado.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date=teclado.next();
		
		Client c1=new Client(name, email, sdf.parse(date));
		
		Order o1=new Order(new Date(),OrderStatus.PROCESSING,c1);
		
		System.out.print("How many items to this order? ");
		Integer numItems=teclado.nextInt();
		
		for (int i=1;i<=numItems;i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			teclado.nextLine();
			String productName=teclado.nextLine();
			System.out.print("Product price: ");
			Double productPrice=teclado.nextDouble();
			
			Product p1=new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			Integer productQuantity=teclado.nextInt();
			o1.addItem(new OrderItem(productQuantity, productPrice, p1));
		}
		
		System.out.println(o1);
		
		teclado.close();
	}

}
