package abstraction;

public class UPIPayment extends PaymentGateway {
    void validatePayment() {
        System.out.println("Validating UPI ID...");
    }

    void makePayment() {
        System.out.println("Payment done via UPI.");
    }
}
