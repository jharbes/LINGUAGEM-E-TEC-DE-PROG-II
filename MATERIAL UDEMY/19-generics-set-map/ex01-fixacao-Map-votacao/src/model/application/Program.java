package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// C:\Users\Jorge\Desktop\Udemy\JAVA-POO-PROJETOS-NA\19-generics-set-map\votacao.csv

		String path = "C:\\Users\\Jorge\\Desktop\\Udemy\\JAVA-POO-PROJETOS-NA\\19-generics-set-map\\votacao.csv";

		Map<String, Integer> votacao = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String params[] = line.split(",");

				if (votacao.containsKey(params[0]))
					votacao.put(params[0], Integer.parseInt(params[1]) + votacao.get(params[0]));
				else
					votacao.put(params[0], Integer.parseInt(params[1]));

				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println(votacao);
		System.out.println();

		for (String item : votacao.keySet())
			System.out.println(item + ": " + votacao.get(item));
	}

}
