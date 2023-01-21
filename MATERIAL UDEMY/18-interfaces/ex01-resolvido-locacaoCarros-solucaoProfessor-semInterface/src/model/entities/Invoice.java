package model.entities;

public class Invoice {

	private Double basicPayment;
	private Double tax;

	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		super();
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return this.getBasicPayment() - this.getTax();
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

}
