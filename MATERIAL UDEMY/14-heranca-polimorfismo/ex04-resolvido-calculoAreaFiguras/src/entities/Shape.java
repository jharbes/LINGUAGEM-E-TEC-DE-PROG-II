package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
		
	}

	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract Double area();

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
}
