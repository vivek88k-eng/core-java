package hierarchicalinheritance;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

   
    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

