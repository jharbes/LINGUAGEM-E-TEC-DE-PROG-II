package model.services;

import java.util.ArrayList;
import java.util.List;

// utilizamos o tipo <T> para a print service que sera o tipo Generics, este permitira que a lista seja instanciada com qualquer tipo, contato que depois de instanciado o primeiro os proximos tambem mantenham o mesmo tipo
public class PrintService<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		// TODO Auto-generated method stub
		list.add(value);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

	public T first() {
		// TODO Auto-generated method stub
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		return list.get(0);
	}

}
