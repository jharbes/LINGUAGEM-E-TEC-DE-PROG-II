import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		Department d1 = new Department(teclado.nextLine());

		System.out.println("Enter worker data:");

		System.out.print("Name: ");
		String name = teclado.nextLine();

		System.out.print("Level: ");
		String level = teclado.nextLine();

		System.out.print("Base salary: ");
		Double baseSalary = teclado.nextDouble();

		Worker w1 = new Worker(name, WorkerLevel.valueOf(level), baseSalary, d1);

		System.out.print("How many contracts to this worker? ");
		Integer numeroContratos = teclado.nextInt();

		for (int i = 0; i < numeroContratos; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(teclado.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = teclado.nextDouble();
			System.out.print("Duration (hours): ");
			Integer duration = teclado.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, duration);
			w1.addContract(contract);
		}
		System.out.println();

		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = teclado.next();
		Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
		Integer year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + w1.getName());
		System.out.println("Department: " + w1.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", w1.income(year, month)));

		teclado.close();
	}

}
