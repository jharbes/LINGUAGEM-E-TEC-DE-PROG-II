package model.application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area myCircles: " + totalArea(myCircles));

	}

	// com a expressao <? extends Shape> o tipo a ser utilizado pode ser Shape ou
	// qualquer outro subtipo dele
	// no entanto nesse caso nao poderao ser adicionados elementos na lista de
	// elementos coringa
	private static Double totalArea(List<? extends Shape> list) {
		Double sum = 0.0;
		for (Shape s : list)
			sum += s.area();

		return sum;
	}

}
