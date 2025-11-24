package shop;

public class Grocery extends Product {

    public Grocery(String productId, String name, double price, int quantity) {
        super(productId, name, price, quantity);
    }

    @Override
    public void getDetails() { }
}
