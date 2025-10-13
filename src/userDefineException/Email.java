package userDefineException;

public class Email {
	void emailCheck(String email) throws InvalidEmailException {
		if(email.contains("@") || email.contains(".")) {
			throw new  InvalidEmailException("Invalid Email");
		}
	}

}
