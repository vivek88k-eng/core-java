package abstraction;

public abstract class PaymentGateway {
    abstract void validatePayment();
    abstract void makePayment();
}

