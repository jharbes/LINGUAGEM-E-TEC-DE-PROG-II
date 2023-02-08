package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		Integer numeroContrato = teclado.nextInt();

		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataContrato = LocalDate.parse(teclado.next(), fmt);

		System.out.print("Valor do contrato: ");
		Double valorContrato = teclado.nextDouble();

		System.out.print("Entre com o número de parcelas: ");
		Integer numeroMesesContrato = teclado.nextInt();

		Contract contrato = new Contract(numeroContrato, dataContrato, valorContrato);

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contrato, numeroMesesContrato);

		System.out.println("Parcelas:");

		for (Installment parcela : contrato.getInstallments())
			System.out.println(parcela.getDate().format(fmt) + " - " + String.format("%.2f", parcela.getAmount()));

		teclado.close();
	}

}
