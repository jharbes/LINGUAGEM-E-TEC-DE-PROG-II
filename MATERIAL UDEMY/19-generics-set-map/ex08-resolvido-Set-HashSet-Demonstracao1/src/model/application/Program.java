package model.application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		/*
		 * set.add("TV"); set.add("Notebook"); set.add("Tablet");
		 */

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));

		// observe apos a impressao que o HashSet nao garante a ordem conforme foram
		// inseridos os elementos na saida, quando a ordem nao importa o HashSet eh o
		// mais indicado pois eh o mais rapido
		for (String p : set) {
			System.out.println(p);
		}
	}
}
