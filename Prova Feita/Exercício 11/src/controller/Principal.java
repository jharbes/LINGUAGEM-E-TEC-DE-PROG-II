package controller;
import java.util.Scanner;
import model.*;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		System.out.printf("Informe o nome da pessoa: ");
		pessoa.setNome(ler.nextLine());
		System.out.printf("\nInforme o ano de nascimento da pessoa: ");
		pessoa.setData_mascimento(ler.nextInt());
		
		System.out.println("\nA idade do(a) "+pessoa.getNome()+" é: "+pessoa.retorna_idade(pessoa.getData_mascimento()));
	}
}