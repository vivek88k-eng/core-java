package shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(Product p, int qty) { }
    public void removeItem(String productId) { }
    public void showCart() { }
    public double getTotal() { return 0; }
}
