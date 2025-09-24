package multilevelinheritance;

public class Rectangle extends Shape {
    int length, breadth;

    void inputRectangle(int id, String name, int length, int breadth) {
        input(id, name);
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}
