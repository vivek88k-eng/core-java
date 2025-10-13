package userDefineException;

public class Password {
	public void checkPassword(String password)throws WeakPasswordException {
		if(password.length()<8) {
			throw new WeakPasswordException("Invalid Password Password must be 8 char");
		}
		
	}

}
