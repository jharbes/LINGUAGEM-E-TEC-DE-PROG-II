package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o caminho do arquivo com os dados dos itens vendidos: ");
		String strPath = teclado.nextLine();
		List<Produto> lista = new ArrayList<>();
		File file = new File(strPath);

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();

			while (line != null) {
				String[] lineSeparada = line.split(",");

				String lineNova = lineSeparada[0] + "," + Float.toString(
						(Float.valueOf(lineSeparada[1]).floatValue() * Float.valueOf(lineSeparada[2]).floatValue()));

				lista.add(new Produto(lineSeparada[0], Float.valueOf(lineSeparada[1]).floatValue(),
						Integer.valueOf(lineSeparada[2]).intValue()));
				System.out.println(lineNova);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		String strPath2 = file.getParent() + "\\out\\summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath2))) { // se usarmos o new
																					// FileWriter(path,true)
																					// ele nao recriara o arquivo,
																					// escrevera
																					// a partir do ultimo texto
																					// existente
			for (Produto produto : lista) {
				bw.write(produto.getNome() + "," + Float.toString(produto.getPreco() * produto.getQuantidade()));
				bw.newLine(); // necessario pois o comando write nao pula linha, usamos o comando atual para
								// pularmos linha antes de escrever o proximo elemento do vetor
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		teclado.close();
	}

}
