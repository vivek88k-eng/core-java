package multilevelinheritance;


	public class Shape {
	    int id;
	    String name;

	    void input(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("Shape ID: " + id + ", Shape: " + name);
	    }
	}


