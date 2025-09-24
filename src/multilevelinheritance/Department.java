package multilevelinheritance;

public class Department extends College {
    String deptName;
    String hod;

    void inputDept(int id, String uniName, String collegeName, String deptName, String hod) {
        inputCollege(id, uniName, collegeName);
        this.deptName = deptName;
        this.hod = hod;
    }

  
    void display() {
        super.display();
        System.out.println("Department: " + deptName + ", HOD: " + hod);
    }
}

