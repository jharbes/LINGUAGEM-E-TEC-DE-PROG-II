package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = teclado.nextInt();
	
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(teclado.next());
	
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(teclado.next());
	
			Reservation r1 = new Reservation(roomNumber,checkin,checkout);
			System.out.println(r1);
	
			System.out.println("\nEnter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(teclado.next());
	
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(teclado.next());
	
			r1.updateDates(checkin, checkout);
			System.out.println(r1);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainException e) {
			System.out.println("Error in reservation: "+e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		teclado.close();
	}

}
