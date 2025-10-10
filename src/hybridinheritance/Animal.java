package hybridinheritance;



public class Animal {
    int id;
    String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Animal ID: " + id + ", Name: " + name);
    }
}
