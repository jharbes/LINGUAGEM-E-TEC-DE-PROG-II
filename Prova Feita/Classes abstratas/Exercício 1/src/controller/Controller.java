package controller;

import java.util.ArrayList;
import model.*;

public class Controller {

	public static void main(String[] args) {
		ArrayList<Animal> lista = new ArrayList<Animal>();
		
		Dog dog = new Dog("Nina");
		lista.add(dog);
		
		Eagle eagle = new Eagle("Águia");
		lista.add(eagle);
		
		Lion lion = new Lion("Leão");
		lista.add(lion);
		
		Ornitorrinco orni = new Ornitorrinco("Ornitorrinco");
		lista.add(orni);
		
		for (Animal item:lista) {
			if (item.getClass() == eagle.getClass()) System.out.println(((Eagle) item).Voar());
			if (item.getClass() == dog.getClass()) System.out.println(((Dog) item).Latir());
			System.out.println(item.Respirar());
			System.out.println(item.Dormir());
			System.out.println(item.Comer());
			System.out.println(item.Andar()+"\n");
		}
	}
}