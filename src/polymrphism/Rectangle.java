package polymrphism;

class Rectangle extends Shape {
 double length, width;

 Rectangle(double l, double w) {
     length = l;
     width = w;
 }


 void area() {
     double result = length * width;
     System.out.println("Area of Rectangle: " + result);
 }

 
 public static void main(String[] args) {
     Shape s;

     s = new Circle(5);       
     s.area();                
     s = new Rectangle(4, 6); 
     s.area();                
 }
}


