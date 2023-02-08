package model.services;

public class DeliverService {

	public Double fee(String state) {
		return state.equalsIgnoreCase("SP") ? 10.0 : 20.0;
	}
}
