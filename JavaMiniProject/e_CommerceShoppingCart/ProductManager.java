package e_CommerceShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product p) {
		products.add(p);
	}

	public Product getProductById(String id) {
		for (Product p : products) {
			if (p.getProductId().equals(id))
				return p;
		}
		return null;
	}

	public void showAllProducts() {
		System.out.println("\n--- AVAILABLE PRODUCTS ---");
		for (Product p : products) {
			p.getDetails();
		}
	}
}
