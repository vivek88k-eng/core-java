package abstraction;

public class CreditCardPayment extends PaymentGateway {
    void validatePayment() {
        System.out.println("Validating Credit Card details...");
    }

    void makePayment() {
        System.out.println("Payment done via Credit Card.");
    }
}

