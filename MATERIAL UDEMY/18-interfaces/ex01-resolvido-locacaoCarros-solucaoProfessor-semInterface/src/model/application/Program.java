package model.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // HH maiusculo para que sejam
																					// consideradas as
																					// 24 horas, ou seja, horarios após
																					// as 12hs
																					// como 13,14,15 etc

		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = teclado.nextLine();

		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(teclado.nextLine(), fmt); // coloca o segundo argumento como fmt para
																			// que a leitura seja feita no formato
																			// mencionado dd/MM/yyyy HH:mm e convertido
																			// para o formato operacional do
																			// LocalDateTime

		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(teclado.nextLine(), fmt);

		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = teclado.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = teclado.nextDouble();

		// embora estejamos instaciando um BrazilTaxService em RentalService nao teremos
		// problema pois BrazilTaxService é um tipo de TaxService que é o atributo de
		// RentalService, ou seja, estaremos fazendo um downcasting
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

		rentalService.processInvoice(carRental);

		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

		teclado.close();
	}

}
