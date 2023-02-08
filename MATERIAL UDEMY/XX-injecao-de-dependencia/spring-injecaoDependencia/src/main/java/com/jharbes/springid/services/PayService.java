package com.jharbes.springid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
	
	@Autowired
	private TaxService taxService;
	
	@Autowired
	private DeliverService deliverService;

	public Double finalPrice(Double cost, String state) {
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}
}
