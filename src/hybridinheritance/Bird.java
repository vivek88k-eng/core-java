package hybridinheritance;

 

public class Bird extends Animal {
    public Bird(int id, String name) {
        super(id, name);
    }

    void layEggs() {
        System.out.println("Bird lays eggs");
    }
}
