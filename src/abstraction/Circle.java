package abstraction;

 class Circle extends Shape {
	 double radius;

	 public Circle(double radius) {
		super();
		this.radius = radius;
	 }
	 double area() {
		 return Math.PI*radius * radius;
	 }
	 double perimeter() {
		 return Math.PI * radius;
	 }

}
