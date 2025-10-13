package userDefineException;

//Custom Exception class
class NegativeSalaryException extends Exception {
 public NegativeSalaryException(String message) {
     super(message);
 }
}

