package model;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Animal {
	private static int incremento=1;
	public static ArrayList<Animal> caes = Default.list_caes();
	
	public int id;
	public String nome;
	public Date data_entrada;
	public String raca;
	public String cor;
	public double peso;

	public Animal(String nome, Date data_entrada, String raca, String cor, double peso) {
		super();
		this.id = incremento++;
		this.nome = nome;
		this.data_entrada = data_entrada;
		this.raca = raca;
		this.cor = cor;
		this.peso = peso;
	}
	
	public void mostrar_animais(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.data_entrada);
			
		System.out.println("+----------------------------");
		System.out.println("| IDENTIFICAÇÃO: "+this.id);
		System.out.println("| Nome: "+this.nome);
		System.out.println("| Data de entrada: "+calendar.get(Calendar.DAY_OF_MONTH)+"/"+(1+calendar.get(Calendar.MONTH))+"/"+calendar.get(Calendar.YEAR));
		System.out.println("| Raça: "+this.raca);
		System.out.println("| Cor: "+this.cor);
		System.out.println("| Peso: "+this.peso+" Kg");
		System.out.println("+----------------------------");
	}
	
	public static void controller_mostrar_animais(ArrayList<Animal> animais) {
		ArrayList<Animal> list_cao = (animais == null) ? caes: animais;
		for(Animal cao:list_cao) cao.mostrar_animais();
	}
	
	public static Animal busca_animal(int id) {
		Animal animal = null;
		for(Animal cao : caes) 
			if(cao.id == id) animal = cao;
		return animal;
	}
	
	public static long calcula_distancia_datas(Date data){
		Date d = data;
		
		@SuppressWarnings("deprecation")
		LocalDateTime data_de_inicio = LocalDateTime.of(d.getYear()+1900, d.getMonth(), d.getDate(), d.getHours(), d.getMinutes());
		LocalDateTime hoje = LocalDateTime.now();
		
		return data_de_inicio.until(hoje, ChronoUnit.DAYS);
	}
	
	public String nutricao(){
		if(this.peso<=20) return "Desnutrido";
		else if(this.peso>20&&this.peso<=30) return "Normal";
		else return "Obeso";
	}
	
	public static void buscar_cao_nome(String nome) {
		ArrayList<Animal> retorno = new ArrayList<Animal>();
		for(Animal cao:caes)
			if(cao.nome.indexOf(nome)>=0) retorno.add(cao);
		
		if(!retorno.isEmpty())
			controller_mostrar_animais(retorno);
		else 
			System.out.println("ANIMAL NÃO ENCONTRADO.");
	}

	public static void busca_caes_desnutridos() {
		ArrayList<Animal> list_animal = new ArrayList<Animal>();
		for(Animal animal:caes)
			switch (animal.nutricao()) {
				case "Desnutrido": list_animal.add(animal);
					break;
			}
		
		if(!list_animal.isEmpty()) {
			System.out.println("CÃES ESTÃO DESNUTRIDOS: "+list_animal.size()+"\tCONDIÇÃO DE DESNUTRIÇÃO (PESO <= 20KG).\n");
			Animal.controller_mostrar_animais(list_animal);
		}else 
			System.out.println("NÃO FORAM ENCONTRADOS ANIMAIS DESNUTRIDOS.");
	}
	
	public static void busca_quantidade_caes_viraLata() {
		ArrayList<Animal> list_animal = new ArrayList<Animal>();
		for(Animal animal:caes)
			if(animal.raca.toLowerCase().contentEquals("vira lata")) list_animal.add(animal);
		
		if(!list_animal.isEmpty()) {
			System.out.println("CÃES DA RAÇA VIRA LATA ENCONTRADOS: "+list_animal.size()+"\n");
			Animal.controller_mostrar_animais(list_animal);
		}else 
			System.out.println("NÃO FORAM ENCONTRADOS ANIMAIS DA RAÇA VIRA LATA.");
	}
	
	public static void busca_caes_amarelos() {
		ArrayList<Animal> list_animal = new ArrayList<Animal>();
		for(Animal animal:caes)
			if(animal.cor.toLowerCase().contentEquals("amarelo")) list_animal.add(animal);
		
		if(!list_animal.isEmpty()) {
			System.out.println("CÃES AMARELOS ENCONTRADOS: "+list_animal.size()+"\n");
			Animal.controller_mostrar_animais(list_animal);
		}else 
			System.out.println("NÃO FORAM ENCONTRADOS ANIMAIS AMARELOS.");
	}
}






