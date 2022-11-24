package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return this.getRadius()*this.getRadius()*Math.PI;
	}
	
}
