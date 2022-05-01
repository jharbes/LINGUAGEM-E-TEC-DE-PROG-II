package model;
import java.util.Calendar;

public class Pessoa {
	private String nome;
	private int data_mascimento;
	
	public String getNome() {
		return nome;
	}
	public int getData_mascimento() {
		return data_mascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setData_mascimento(int data_mascimento) {
		this.data_mascimento = data_mascimento;
	}
	
	public int retorna_idade(int ano) {
		return Calendar.getInstance().get(Calendar.YEAR) - ano;
		
	}
}
