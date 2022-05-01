package model;
import java.util.ArrayList;

public class Pessoa {
	private static int incremento=1;
	public static ArrayList<Pessoa> pessoas = Default.list_pessoas(Animal.caes);
	
	public int id;
	public String nome;
	public String endereco;
	public String telefone;
	public String e_mail;
	public String sexo;
	public Animal animal;
	
	public Pessoa(String nome, String endereco, String telefone, String e_mail, String sexo, Animal animal) {
		super();
		this.id = incremento++;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.e_mail = e_mail;
		this.sexo = sexo;
		this.animal = animal;
	}
	
	public static void mostrar_pessoa() {
		for(Pessoa pessoa:pessoas) {
			System.out.println("+-----------------------------------------");
			System.out.println("| IDENTIFICAÇÃO: "+pessoa.id);
			System.out.println("| Nome: "+pessoa.nome);
			System.out.println("| Endereço: "+pessoa.endereco);
			System.out.println("| Telefone: "+pessoa.telefone);
			System.out.println("| E-mail: "+pessoa.e_mail);
			System.out.println("| Sexo: "+pessoa.sexo);
			System.out.println("+-----------------------------------------");
		}
	}
	
	public static Pessoa verifica_pessoa(int id) {
		Pessoa person = null;
		for(Pessoa pessoa : pessoas) 
			if(pessoa.id == id) person = pessoa;
		
		return person;
	}
}