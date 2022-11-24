package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;
	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.getItems().add(item);
	}

	public void removeItem(OrderItem item) {
		this.getItems().remove(item);
	}

	public Double total() {
		Double total = (double) 0;
		for (OrderItem o : this.getItems()) {
			total += o.subTotal();
		}
		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY:\nOrder moment: " + sdf.format(this.getMoment()));
		sb.append("\nOrder Status: " + this.getStatus());
		sb.append("\nClient: " + this.getClient().getName() + " (" + sdf1.format(this.getClient().getBirthDate()) + ") - "
				+ this.getClient().getEmail());
		sb.append("\nOrder items:\n");
		for (OrderItem o : this.getItems()) {
			sb.append(o.getProduct().getName() + ", $" + String.format("%.2f", o.getProduct().getPrice()) + ", Quantity: " + o.getQuantity()
					+ ", Subtotal: $" + String.format("%.2f", o.subTotal()) + "\n");
		}
		sb.append("Total price: $"+String.format("%.2f", this.total()));

		return sb.toString();
	}

}
