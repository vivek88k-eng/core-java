package e_CommerceShoppingCart;

public class Grocery extends Product {

    public Grocery(String productId, String name, double price, int quantity) {
        super(productId, name, price, quantity);
    }

    @Override
    public void getDetails() {
        System.out.println("ID" + productId +"Grocery: " + name + " | Price: " + price + " | Stock: " + quantity);
    }
}
