package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.UserAccess;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Set<UserAccess> setUserAccess = new HashSet<>();

		System.out.print("Enter file full path: ");
		// C:\Users\Jorge\Desktop\Udemy\JAVA-POO-PROJETOS-NA\19-generics-set-map\inputFile.txt
		
		String path = teclado.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] params = line.split(" ");
				UserAccess userAccess = new UserAccess(params[0], Instant.parse(params[1]));

				setUserAccess.add(userAccess);
				line = br.readLine();
				
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.println(setUserAccess);

		System.out.println("Total users: " + setUserAccess.size());

		teclado.close();
	}

}
