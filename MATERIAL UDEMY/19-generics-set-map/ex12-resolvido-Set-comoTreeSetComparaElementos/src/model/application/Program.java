package model.application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> set = new TreeSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		// observe na impressao de saida que a ordenacao ficou em ordem alfabetica,
		// porem sem considerar V menor que a pois o metodo compareTo criado tranforma
		// em uppercase antes de efetuar as comparacoes
		for (Product p : set) {
			System.out.println(p);
		}
	}

}
