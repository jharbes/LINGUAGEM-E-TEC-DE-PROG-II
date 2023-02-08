package model.entities;

public class Rectangle implements Shape {
	
	private Double width;
	private Double height;
	
	public Rectangle(Double width, Double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
