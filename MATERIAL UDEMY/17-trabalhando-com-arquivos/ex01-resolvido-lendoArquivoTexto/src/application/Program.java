package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\temp\\in.txt"); // o arquivo deve texto deve estar nesse diretorio 
													// para que o programa
													// possa funcionar, favor atentar para isso
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (sc != null)
				sc.close();
		}
	}

}
