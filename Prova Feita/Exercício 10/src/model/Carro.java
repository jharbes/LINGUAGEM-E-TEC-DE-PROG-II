package model;

public class Carro {
	private String modelo;
	private String cor;
	private int ano;
	private float quilometragem_total;
	
	public Carro(String modelo, String cor, int ano, float quilometragem_total) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.quilometragem_total = quilometragem_total;
	}
	
	public Carro() {
		super();
	}

	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public int getAno() {
		return ano;
	}
	public float getQuilometragem_total() {
		return quilometragem_total;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public float retorna_distancia(float tempo, float velocidade) {
		return (float) velocidade * tempo;
	}
	
	public void correr(float quilometragem_total) {
		this.quilometragem_total = quilometragem_total;
	}
}