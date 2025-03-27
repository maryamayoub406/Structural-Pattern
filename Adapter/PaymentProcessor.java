package Adapter;

// New Payment Interface (Target Interface)
public interface PaymentProcessor {
    void processPayment(String cardNumber, double amount);
}

