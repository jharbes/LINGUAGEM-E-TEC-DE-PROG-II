package model.application;

import java.util.HashSet;
import java.util.Set;

import model.entities.Product;
import model.entities.Product1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> set = new HashSet<>();

		Set<Product1> set1 = new HashSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		Product prod = new Product("Notebook", 1200.0);

		System.out.println(set.contains(prod)); // false, pois essa classe Product nao possui implementacao de hashcode
												// e equals, ou seja, ele fara a comparacao apenas da referencia em
												// memoria e como esse novo objeto nao foi igualado ao
												// anterior(referencia de memoria) ele retorna falso

		set1.add(new Product1("TV", 900.0));
		set1.add(new Product1("Notebook", 1200.0));
		set1.add(new Product1("Tablet", 400.0));

		Product1 prod1 = new Product1("Notebook", 1200.0);

		System.out.println(set1.contains(prod1)); // true, pois agora a classe Product1 possui hashCode e equals e nao
													// será necessario mais fazer a comparacao por referencia de
													// memoria, ou seja, a comparacao sera feita pelo conteudo do objeto
													// que eh identico
	}

}
