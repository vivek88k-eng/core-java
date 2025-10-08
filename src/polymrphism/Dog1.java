package polymrphism;


public class Dog1 extends Animal1 {
 void bark() {
     System.out.println("Dog barks loudly.");
 }

 
 public static void main(String[] args) {
     
     Animal1 a = new Dog1();  
     a.eat();                    

    
     Dog1 d = (Dog1) a;       
     d.bark();              
     }
}
