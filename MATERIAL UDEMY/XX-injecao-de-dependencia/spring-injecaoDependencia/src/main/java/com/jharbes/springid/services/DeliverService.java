package com.jharbes.springid.services;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {
	
	public Double fee(String state) {
		return state.equalsIgnoreCase("SP") ? 10.0 : 20.0;
	}
}
