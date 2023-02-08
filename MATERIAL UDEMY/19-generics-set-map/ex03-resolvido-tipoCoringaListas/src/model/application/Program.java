package model.application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	// Porém não é possível adicionar dados a uma
	// coleção de tipo curinga, como o metodo recebe uma lista do tipo <?>, ele
	// nao sabe se pode adicionar ou nao algum elemento de certo tipo
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}
