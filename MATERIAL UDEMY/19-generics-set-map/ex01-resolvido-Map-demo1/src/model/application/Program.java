package model.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// estamos usando o TreeMap onde existe ordenacao, no caso do String sera feita
		// ordenacao pela chave que eh string (ordem alfabetica)
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		System.out.println(cookies);

		cookies.remove("email");

		// observe que como a chave "phone" ja existe o Map ira sobreescrever o valor ja
		// existente permanecendo apenas o antigo
		cookies.put("phone", "99771133");

		System.out.println("\nContains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));

		System.out.println("Email: " + cookies.get("email")); // quando o elemento nao existe ele retorna null
		System.out.println("Size: " + cookies.size());

		System.out.println(cookies);

		System.out.println("\nALL COOKIES:");
		for (String key : cookies.keySet())
			System.out.println(key + ": " + cookies.get(key));
	}

}
