package entities;

public class Retangulo {
	public double largura,altura;
	
	public double area() {
		return this.largura*this.altura;
	}
	
	public double perimetro() {
		return largura*2+altura*2;
	}
	
	public double diagonal() {
		return Math.sqrt(altura*altura+largura*largura);
	}
	
	public void calculosTriangulo() {
		System.out.println("AREA = "+String.format("%.2f",this.area()));
		System.out.println("PERIMETER = "+String.format("%.2f",this.perimetro()));
		System.out.println("DIAGONAL = "+String.format("%.2f",this.diagonal()));
	}
}
