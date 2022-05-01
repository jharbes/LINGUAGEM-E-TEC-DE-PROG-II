package model;

public class Retangulo {
	private float base;
	private float altura;
	
	public float getBase() {
		return base;
	}
	public float getAltura() {
		return altura;
	}

	public void setBase(float base) {
		this.base = base;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calcula_perimetro() {
		return this.base*2 + this.altura*2;
	}
	
	public float calcula_area() {
		return this.base * this.altura;
	}
}
