package Adapter;

// Adapter to bridge OldPaymentGateway with PaymentProcessor
public class PaymentAdapter implements PaymentProcessor {
    private OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    @Override
    public void processPayment(String cardNumber, double amount) {
        oldPaymentGateway.payWithCard(cardNumber, amount);
    }
}

