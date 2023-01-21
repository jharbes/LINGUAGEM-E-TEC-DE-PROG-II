package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com o caminho de um arquivo: ");
		String strPath = teclado.nextLine();

		File path = new File(strPath);

		System.out.println("\ngetName: " + path.getName()); // retorna o nome do arquivo
		
		System.out.println("getParent: " + path.getParent()); // retorna o caminho do arquivo porem sem o nome do
																// proprio arquivo
		
		System.out.println("getPath: " + path.getPath()); // retorna o caminho completo do arquivo

		teclado.close();
	}

}
