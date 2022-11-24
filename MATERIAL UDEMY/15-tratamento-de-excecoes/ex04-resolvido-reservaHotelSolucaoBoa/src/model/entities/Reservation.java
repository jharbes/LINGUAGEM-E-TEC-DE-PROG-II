package model.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Instanciado como estatico para que a
																				// cada vez que for utilizado nao seja
																				// instanciado mais um objeto do mesmo
																				// tipo novo.

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws ParseException {
		super();

		Date now = sdf.parse("06/06/2018"); // Utilizamos a data atual como se fosse a data de quando foi gravado o
		// video, pois se assim nao fizermos os exemplos nao funcionarao no
		// exercicio

		if (checkin.before(now) || checkout.before(now))
			throw new DomainException("Reservation dates for update must be future dates");
		if (!checkout.after(checkin))
			throw new DomainException("Check-out date must be after check-in date");
		
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkin, Date checkout) throws ParseException {
		
		Date now = sdf.parse("06/06/2018"); // Utilizamos a data atual como se fosse a data de quando foi gravado o
		// video, pois se assim nao fizermos os exemplos nao funcionarao no
		// exercicio
		
		if (checkin.before(now) || checkout.before(now))
			throw new DomainException("Reservation dates for update must be future dates");
		if (!checkout.after(checkin))
			throw new DomainException("Check-out date must be after check-in date");

		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	@Override
	public String toString() {
		return "Reservation: Room " + roomNumber + ", check-in: " + sdf.format(checkin) + ", check-out: "
				+ sdf.format(checkout) + ", " + this.duration() + " nights";
	}

}
