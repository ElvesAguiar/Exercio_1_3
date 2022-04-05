package entities;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double Area() {
		return height*width;
	}

	public double Perimeter() {
		return 2*height+2*width;
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(width,2)+Math.pow(height, 2));
	}
}
