package singleinheritance;

public class Rectangle extends Shape {
	double length,width;

	public Rectangle(String shapeName, double length, double width) {
		super(shapeName);
		this.length = length;
		this.width = width;
	}
	double calculateArea() {
		return length*width;
	}
	void display() {
		System.out.println("Shape:" + shapeName);
		System.out.println("Area:" + calculateArea());
		
	}

}
