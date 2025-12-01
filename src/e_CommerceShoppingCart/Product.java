package e_CommerceShoppingCart;

public abstract class Product {
	protected String productId;
	protected String name;
	protected double price;
	protected int quantity;

	public Product(String productId, String name, double price, int quantity) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public abstract void getDetails();

	public String getProductId() {
		return productId;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void reduceStock(int qty) throws OutOfStockException {
		if (quantity < qty) {
			throw new OutOfStockException("Not enough stock for: " + name);
		}
		quantity -= qty;
	}

	public void increaseStock(int qty) {
		quantity += qty;
	}
}
