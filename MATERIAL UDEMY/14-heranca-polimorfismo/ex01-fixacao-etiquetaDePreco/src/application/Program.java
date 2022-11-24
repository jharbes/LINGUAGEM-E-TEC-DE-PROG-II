package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		Integer numProdutos = teclado.nextInt();

		List<Product> lista = new ArrayList<>();

		for (int i = 1; i <= numProdutos; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tipoProduto = teclado.next().charAt(0);

			teclado.nextLine();
			System.out.print("Name: ");
			String nomeProduto = teclado.nextLine();

			System.out.print("Price: ");
			Double precoProduto = teclado.nextDouble();

			if (tipoProduto == 'i' || tipoProduto == 'I') {
				System.out.print("Customs fee: ");
				Double taxaImportacao = teclado.nextDouble();
				lista.add(new ImportedProduct(nomeProduto, precoProduto, taxaImportacao));
			} else if (tipoProduto == 'u' || tipoProduto == 'U') {
				System.out.print("Manufactured date (DD/MM/YYYY): ");
				String data = teclado.next();
				Date dataFabricacao = sdf.parse(data);
				lista.add(new UsedProduct(nomeProduto, precoProduto, dataFabricacao));
			} else
				lista.add(new Product(nomeProduto, precoProduto));
		}

		System.out.println("PRICE TAGS:");

		for (Product p : lista)
			System.out.println(p.priceTag());

		teclado.close();
	}

}
