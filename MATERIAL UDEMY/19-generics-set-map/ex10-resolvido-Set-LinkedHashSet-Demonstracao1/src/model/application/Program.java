package model.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new LinkedHashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("PS5");
		set.add("Switch");
		set.add("Xbox");

		set.remove("PS5");

		// remove todos os elementos cujo comprimento seja maior do que sete caracteres
		set.removeIf(x -> x.length() >= 7);

		// remove todos os elementos cuja primeira letra seja T(case sensitive)
		set.removeIf(x -> x.charAt(0) == 'T');

		System.out.println(set.contains("Notebook"));

		// observe dessa vez que ele manteve a ordem em que os elementos foram inseridos
		for (String p : set) {
			System.out.println(p);
		}
	}

}
