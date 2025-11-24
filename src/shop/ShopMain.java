package shop;

import java.util.Scanner;

public class ShopMain {

    private static Scanner sc = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();
    private static Cart cart = new Cart();
    private static CouponManager couponManager = new CouponManager();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n==== SHOP MENU ====");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Remove Product");
            System.out.println("3. Show Cart");
            System.out.println("4. Apply Coupon");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> addProductToCart(); 
                case 2 -> removeProduct(); 
                case 3 -> cart.showCart(); 
                case 4 -> applyCoupon(); 
                case 5 -> checkout(); 
                case 6 -> return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addProductToCart() { }
    private static void removeProduct() { }
    private static void applyCoupon() { }
    private static void checkout() { }
}
