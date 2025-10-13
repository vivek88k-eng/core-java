package userDefineException;

public class Shopping {
	int avlStock=10;
	
	void purchase(int quantity)throws InvalidQuantityException{
		if(quantity<0 || quantity>10) {
			throw new  InvalidQuantityException("invalid quantity");
		}
		
	}

}
