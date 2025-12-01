package e_CommerceShoppingCart;

public class Electronics extends Product {

    public Electronics(String productId, String name, double price, int quantity) {
        super(productId, name, price, quantity);
    }

    @Override
    public void getDetails() {
        System.out.println("ID" + productId +"  | Electronics: " + name + " | Price: " + price + " | Stock: " + quantity);
    }
}
