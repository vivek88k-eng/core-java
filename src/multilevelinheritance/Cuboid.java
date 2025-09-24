package multilevelinheritance;

public class Cuboid extends Rectangle {
    int height;

    void inputCuboid(int id, String name, int length, int breadth, int height) {
        inputRectangle(id, name, length, breadth);
        this.height = height;
    }

    int surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}
