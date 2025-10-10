package hybridinheritance;


public class Laptop extends Device {
    int ram;
    String processor;

    public Laptop(int id, String name, int ram, String processor) {
        super(id, name);
        this.ram = ram;
        this.processor = processor;
    }

    void display() {
        super.display();
        System.out.println("RAM: " + ram + "GB, Processor: " + processor);
    }
}

