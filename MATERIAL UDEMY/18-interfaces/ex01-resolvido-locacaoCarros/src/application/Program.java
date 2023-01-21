package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Locacao;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); // HH maiusculo para que sejam consideradas as
																			// 24 horas, ou seja, horarios após as 12hs
																			// como 13,14,15 etc

		Date retirada = new Date();
		Date retorno = new Date();

		System.out.println("Entre com os dados do aluguel");

		System.out.print("Modelo do carro: ");
		String nomeCarro = teclado.nextLine();

		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		try {
			retirada = sdf.parse(teclado.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		try {
			retorno = sdf.parse(teclado.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("Entre com o preco por hora: ");
		float precoPorHora = teclado.nextFloat();

		System.out.print("Entre com o preco por dia: ");
		float precoPorDia = teclado.nextFloat();

		Locacao locacao = new Locacao(nomeCarro, retirada, retorno, precoPorHora, precoPorDia);

		System.out.println("\nFATURA");
		System.out.println("Pagamento basico: " + String.format("%.2f", locacao.valorLocacao()));
		System.out.println("Imposto: " + String.format("%.2f", locacao.valorImposto()));
		System.out.println("Pagamento total: " + String.format("%.2f", locacao.valorLocacaoComImposto()));

	}

}
