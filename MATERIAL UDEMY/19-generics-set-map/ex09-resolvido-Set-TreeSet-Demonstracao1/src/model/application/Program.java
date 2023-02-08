package model.application;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new TreeSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));

		// repare que no caso do Set ele imprime os itens com ordenacao de String (TV
		// vem antes de Tablet pois o caractere V eh menor que a na tabela ASCII)
		for (String p : set) {
			System.out.println(p);
		}
	}

}
