package hierarchicalinheritance;

public class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

   
    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

