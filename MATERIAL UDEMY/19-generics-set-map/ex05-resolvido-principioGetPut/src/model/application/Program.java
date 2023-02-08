package model.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);

		List<? extends Number> list = intList;
		Number x = list.get(0);

		// covariancia: quando a operacao de get é permitida mas a operacao de insercao
		// nao é permitida
		// list.add(20);

		// -------------------------------------------------------------------------//

		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);

		// contravariancia, quando a operacao de insercao é permitida mas a operacao de
		// get nao é permitida, pois nao é possivel garantir que o objeto a ser buscado
		// na lista seja do tipo number conforme abaixo aparenta ser esperado
		// Number x = myNums.get(0); // erro de compilacao
	}

}
