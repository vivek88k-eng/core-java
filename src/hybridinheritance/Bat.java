package hybridinheritance;



public class Bat extends Mammal {
    public Bat(int id, String name) {
        super(id, name);
    }

    void fly() {
        System.out.println("Bat can fly");
    }
}
