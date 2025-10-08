package polymrphism;


public class Cat extends Animal {

 void sound() {
     System.out.println("Cat meows");
 }


 public static void main(String[] args) {
     Animal a; 

     a = new Dog();   
     a.sound();       

     a = new Cat();   
     a.sound();        }
}

