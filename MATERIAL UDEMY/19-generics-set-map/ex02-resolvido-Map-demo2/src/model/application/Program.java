package model.application;

import java.util.HashMap;
import java.util.Map;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Product, Double> stock = new HashMap<>();

		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		Product ps = new Product("Tv", 900.0);

		// ele retorna true porque possui o equals e hashcode que faz a comparacao pelo
		// conteudo (no caso apenas o nome do produto), caso nao tivesse ele faria
		// comparacao pelo ponteiro(registro de local na memoria) o que daria falso pois
		// os objetos nao sao originados de uma igualdade (onde um aponta para o outro)
		// referencias de ponteiros diferentes
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
