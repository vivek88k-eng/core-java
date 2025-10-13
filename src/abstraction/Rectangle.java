package abstraction;

 class Rectangle extends Shape {
	double length,width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	double area() {
		return length * width;
	}
	double perimeter() {
		return 2 * length + width;
	}

}
