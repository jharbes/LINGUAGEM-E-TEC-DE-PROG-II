package model.services;

public class PayService {

	private TaxService taxService = new TaxService();
	private DeliverService deliverService = new DeliverService();

	public Double finalPrice(Double cost, String state) {
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}
}