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
		String path = teclado.next();
		Integer userSum = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] params = line.split(" ");
				UserAccess userAccess = new UserAccess(params[0], Instant.parse(params[1]));
				if (!setUserAccess.contains(userAccess))
					userSum++;

				setUserAccess.add(userAccess);
				line = br.readLine();
				System.out.println(userAccess);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println("Total users: " + userSum);

		teclado.close();
	}

}
