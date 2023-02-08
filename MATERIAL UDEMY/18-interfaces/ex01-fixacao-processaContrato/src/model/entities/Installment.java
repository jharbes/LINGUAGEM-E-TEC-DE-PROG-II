package model.entities;

import java.time.LocalDate;

public class Installment {
	
	private LocalDate date;
	private Double amount;
	
	public Installment() {
	}

	public Installment(LocalDate date, Double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
