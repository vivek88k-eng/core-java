package multilevelinheritance;

public class College extends University {
    String collegeName;

    void inputCollege(int id, String uniName, String collegeName) {
        input(id, uniName);
        this.collegeName = collegeName;
    }

    
    void display() {
        super.display();
        System.out.println("College: " + collegeName);
    }
}

