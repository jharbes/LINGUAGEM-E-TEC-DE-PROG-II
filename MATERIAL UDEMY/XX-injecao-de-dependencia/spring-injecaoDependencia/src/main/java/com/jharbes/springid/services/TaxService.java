package com.jharbes.springid.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
	
	public Double tax(Double value) {
		return value * 0.1;
	}
}
