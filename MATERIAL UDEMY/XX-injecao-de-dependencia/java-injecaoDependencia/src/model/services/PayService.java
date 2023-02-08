package model.services;

public class PayService {

	private TaxService taxService;
	private DeliverService deliverService;

	// as dependencias TaxService e DeliverService serao injetadas via contrutor,
	// nao mais sao criadas na propria classe mas sim injetadas, nesse caso, pelo
	// programa principal
	public PayService(TaxService taxService, DeliverService deliverService) {
		super();
		this.taxService = taxService;
		this.deliverService = deliverService;
	}

	public Double finalPrice(Double cost, String state) {
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}
}