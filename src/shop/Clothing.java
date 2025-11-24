package shop;

public class Clothing extends Product {

    public Clothing(String productId, String name, double price, int quantity) {
        super(productId, name, price, quantity);
    }

    @Override
    public void getDetails() { }
}
