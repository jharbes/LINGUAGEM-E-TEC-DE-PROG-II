package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // se usarmos o new FileWriter(path,true)
																				// ele nao recriara o arquivo, escrevera
																				// a partir do ultimo texto existente
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // necessario pois o comando write nao pula linha, usamos o comando atual para
								// pularmos linha antes de escrever o proximo elemento do vetor
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
