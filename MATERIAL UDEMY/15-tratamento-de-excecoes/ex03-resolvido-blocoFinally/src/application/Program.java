package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\temp\\in.txt"); // Arquivo nao existe, logo sera enviado para a exceçao necessariamente
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed."); // Mensagem apenas para constar que o bloco finally foi executado
		}
	}

}
