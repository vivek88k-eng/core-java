package userDefineException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		try {
			emp.setSalary(-5000);
		}catch (NegativeSalaryException e) {
			System.out.println("Invalid Salary");
		}
		System.out.println("........................");
		//MAIN OF PASSWORD
		Password p1 = new Password();
		try {
		String password ="1234";
		p1.checkPassword(password);
		}catch (WeakPasswordException e) {
			System.out.println("Invalid Password");
		}
		System.out.println("........................");
		//MAIN OF SHOPPING
		Shopping obj = new Shopping();
		try {
			int quantity=11;
			obj.purchase(quantity);
		}catch(InvalidQuantityException e) {
			System.out.println("Invalid Quantity:");
		}
		System.out.println("........................");
		//MAIN OF EMAIL
		Email e1 =new Email();
		try {
			String email = "vivek34.gmail.com";
			e1.emailCheck(email);
		}catch(InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("........................");
		//MAIN OF DIVIDE
		Divide d1 = new Divide();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1");
            int a = sc.nextInt();
            System.out.println("Enter num2");
             int b = sc.nextInt();
		
		try {
			d1.divideCheck(a, b);
		}catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
