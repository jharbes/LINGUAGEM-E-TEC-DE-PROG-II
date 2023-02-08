package model.application;

import model.entities.Client;

public class Program {

	public static void main(String[] args) {

		/*
		 * Equals Método que compara se o objeto é igual a outro, retornando true ou
		 * false.
		 */

		String a = "Maria";
		String b = "Alex";
		String c = "Maria";

		System.out.println(a.equals(b));
		System.out.println(a.equals(a));
		System.out.println(a == b);
		System.out.println(a == c);

		/*
		 * HashCode Método que retorna um número inteiro representando um código gerado
		 * a partir das informações do objeto, para objetos identicos serao gerados
		 * hashcode identicos
		 */

		String a1 = "Maria";
		String b1 = "Alex";
		String c1 = "Maria";
		System.out.println(a1.hashCode());
		System.out.println(b1.hashCode());
		System.out.println(c1.hashCode());

		Client cli1 = new Client("Maria", "maria@gmail.com");
		Client cli2 = new Client("Alex", "alex@gmail.com");
		Client cli3 = new Client("Maria", "maria@gmail.com");

		System.out.println(cli1.hashCode());
		System.out.println(cli2.hashCode());
		System.out.println(cli3.hashCode());

		System.out.println(cli1.equals(cli2)); // false
		System.out.println(cli1.equals(cli3)); // true

		System.out.println(cli1 == cli3); // false, pois ele compara nao seu conteudo mas suas referencias de memoria e
											// posicionamento sao diferentes,
											// logo o resultado nao eh true

		// por isso que sempre que for necessario comparar dois OBJETOS pelo CONTEUDO
		// dos objetos sempre dar preferencia pelo equals, == apenas sera usado quando
		// quiser fazer comparacao pela refencia dos objetos

		String s1 = "Teste";
		String s2 = "Teste";

		System.out.println(s1 == s2); // true

		String s3 = new String("Teste");
		String s4 = new String("Teste");

		System.out.println((s3 == s4)); // false
	}

}
