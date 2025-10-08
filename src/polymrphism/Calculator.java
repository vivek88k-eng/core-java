package polymrphism;

public class Calculator {
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
    public static void main(String[] args) {
    	Calculator cal = new Calculator();
    	System.out.println("Sum of 2 integers:" +cal.add(5, 10));
    	System.out.println("Sum of 2 double:" +cal.add(5.4, 10.2));
    	System.out.println("Sum of 3 integers:" +cal.add(5, 10 ,22));
    	
    }
}
