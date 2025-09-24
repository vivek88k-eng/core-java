package hierarchicalinheritance;

public class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    
    void area() {
        System.out.println("Square Area: " + (side * side));
    }
}

