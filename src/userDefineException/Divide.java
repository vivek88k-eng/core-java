package userDefineException;

public class Divide {
	void divideCheck(int a, int b)throws DivideByZeroException{
		if(b==0) {
			throw new  DivideByZeroException("Divide by zero ");
		}else {
			System.out.println(a/b);
		}
		
	}

}
