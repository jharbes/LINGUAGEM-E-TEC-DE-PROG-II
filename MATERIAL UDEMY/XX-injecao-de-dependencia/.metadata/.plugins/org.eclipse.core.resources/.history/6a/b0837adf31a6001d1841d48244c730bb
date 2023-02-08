package com.jharbes.springid.services;


public class PayService {
	
	private TaxService taxService;
	private DeliverService deliverService;

	public PayService(TaxService taxService, DeliverService deliverService) {
		super();
		this.taxService = taxService;
		this.deliverService = deliverService;
	}

	public Double finalPrice(Double cost, String state) {
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}
}
