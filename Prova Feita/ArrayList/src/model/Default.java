package model;
import java.util.ArrayList;
import java.util.Date;

public class Default {
	
	public static ArrayList<Pessoa> list_pessoas (ArrayList<Animal> caes) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa("Diana", "Rua das pedrinhas, nº 15", "(21) 9 9456-6315", "diana@gmail.com", "Feminino", caes.get(0));
		Pessoa pessoa2 = new Pessoa("Louis", "Rua carolina machado, nº 685", "(21) 9 1345-2506", "louis@gmail.com", "Masculino", caes.get(1));
		Pessoa pessoa3 = new Pessoa("Bruce", "Rua antimônio, nº 413", "(21) 9 4816-8613", "bruce@gmail.com", "Masculino", caes.get(2));
		Pessoa pessoa4 = new Pessoa("Clark", "Avenida das américas, nº 312", "(21) 9 7134-8264", "clark@gmail.com", "Masculino", caes.get(3));
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		return pessoas;
	}

	public static ArrayList<Animal> list_caes() {
		ArrayList<Animal> caes = new ArrayList<Animal>();
		@SuppressWarnings("deprecation")
		Date date = new Date(109, 6, 12);
		Animal animal1 = new Animal("Kate", date, "Vira Lata", "Preto", 35);
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(110, 10, 9);
		Animal animal2 = new Animal("Bob", date2, "Bulldog", "Preto", 22);
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date(107, 3, 2);
		Animal animal3 = new Animal("Pitty", date3, "Pitbull", "Branco", 38);
		
		@SuppressWarnings("deprecation")
		Date date4 = new Date(101, 5, 8);
		Animal animal4 = new Animal("Kelly", date4, "Labrador", "Amarelo", 36);
		
		@SuppressWarnings("deprecation")
		Date date5 = new Date(108, 11, 9);
		Animal animal5 = new Animal("Peixe", date5, "Vira Lata", "Amarelo", 20);
		
		@SuppressWarnings("deprecation")
		Date date6 = new Date(110, 10, 9);
		Animal animal6 = new Animal("Grazi", date6, "Pastor", "Amarelo", 18);
		
		caes.add(animal1);
		caes.add(animal2);
		caes.add(animal3);
		caes.add(animal4);
		caes.add(animal5);
		caes.add(animal6);
		return caes;
	}

	public static ArrayList<FichaAdocao> list_fichas(ArrayList<Animal> caes, ArrayList<Pessoa> pessoas) {
		ArrayList<FichaAdocao> fichas = new ArrayList<FichaAdocao>();
		@SuppressWarnings("deprecation")
		Date date = new Date(120, 11, 24);
		FichaAdocao ficha1 = new FichaAdocao(date, caes.get(0), pessoas.get(0), 4380, "Obeso");
		
		@SuppressWarnings("deprecation")
		Date date1 = new Date(113, 3, 20);
		FichaAdocao ficha2 = new FichaAdocao(date1, caes.get(1), pessoas.get(1), 4015, "Normal");
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(118, 6, 18);
		FichaAdocao ficha3 = new FichaAdocao(date2, caes.get(2), pessoas.get(2), 5110, "Obeso");
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date(117, 9, 1);
		FichaAdocao ficha4 = new FichaAdocao(date3, caes.get(3), pessoas.get(3), 7300, "Obeso");
		
		fichas.add(ficha1);
		fichas.add(ficha2);
		fichas.add(ficha3);
		fichas.add(ficha4);
		return fichas;
	}
}