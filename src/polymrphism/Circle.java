package polymrphism;


class Circle extends Shape {
 double radius;

 Circle(double r) {
     radius = r;
 }

 
 void area() {
     double result = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + result);
 }
}

