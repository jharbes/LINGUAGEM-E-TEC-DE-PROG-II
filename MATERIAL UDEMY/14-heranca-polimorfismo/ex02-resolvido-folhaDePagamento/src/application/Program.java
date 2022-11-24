package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		List<Employee> list1 = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		Integer numEmployees = teclado.nextInt();

		for (int i = 1; i <= numEmployees; i++) {
			System.out.println("Employee #" + i + " data:");

			System.out.print("Outsourced (y/n)? ");
			char outsourced = (char) System.in.read();

			System.out.print("Name: ");
			teclado.nextLine();
			teclado.nextLine();
			String name = teclado.nextLine();

			System.out.print("Hours: ");
			Integer hours = teclado.nextInt();

			System.out.print("Value per hour: ");
			Double valuePerHour = teclado.nextDouble();

			if (outsourced == 'Y' || outsourced == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = teclado.nextDouble();
				list1.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else
				list1.add(new Employee(name, hours, valuePerHour));
		}

		System.out.println("\nPAYMENTS:");
		for (Employee e : list1) {
			System.out.println(e.getName() + " -  $ " + String.format("%.2f", e.payment()));
		}

		teclado.close();
	}

}
