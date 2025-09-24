package hierarchicalinheritance;

public class Developer extends Employee {
    String language;

    void inputDev(int id, String name, String lang) {
        input(id, name);
        this.language = lang;
    }

    void display() {
        super.display();
        System.out.println("Language: " + language);
    }
}
