package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com o caminho de uma pasta: ");
		String strPath = teclado.nextLine();

		File path = new File(strPath); // uma variavel do tipo file pode ser tanto o caminho de um arquivo quanto o
										// caminho de uma pasta

		File[] folders = path.listFiles(File::isDirectory); // A função File::isDirectory lista apenas o que for
															// diretorio dentro da pasta correspondente a variavel path,
															// ou seja, sera criado um vetor de File de nome folders com
															// os diretorios qu estao no interior da pasta.
		System.out.println("\nFOLDERS:");
		for (File folder : folders)
			System.out.println(folder); // vai imprimir a lista de pastas correspondente ao diretorio informado pelo
										// usuario

		File[] files = path.listFiles(File::isFile); // Nesse caso a funcao File::isFile vai listar apenas o que sao
														// arquivos dentro do diretorio informado pelo usuario
		System.out.println("\nFILES:");
		for (File file : files)
			System.out.println(file);

		boolean success = new File(strPath + "\\subdir").mkdir(); // comando efetua a criacao de um diretorio e retorna
																	// o booleano informando se foi criado ou nao
		System.out.println("\nDiretorio criado com sucesso: " + success);

		teclado.close();
	}

}
