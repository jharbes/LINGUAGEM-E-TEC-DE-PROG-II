package model.exceptions;

/*
 * Quando trabalhos com uma classe de exceção geralmente utilizamos o sufixo Exception em seu nome;
 */

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L; 
	
	public DomainException(String msg) {
		super(msg);
	}
}
