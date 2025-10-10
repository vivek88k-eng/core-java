package hybridinheritance;



public class Mammal extends Animal {
    public Mammal(int id, String name) {
        super(id, name);
    }

    void giveBirth() {
        System.out.println("Mammal gives birth");
    }
}

