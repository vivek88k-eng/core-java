package polymrphism;


public class Bike extends Vehicle {
 
 void start() {
     System.out.println("Bike starts with a kick or button.");
 }

 
 public static void main(String[] args) {
     Vehicle v;

     v = new Car();
     v.start();

     v = new Bike();
     v.start();
 }
}

