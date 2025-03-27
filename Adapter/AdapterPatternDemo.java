package Adapter;

// Main class to demonstrate Adapter Pattern
public class AdapterPatternDemo {
    public static void main(String[] args) {
        OldPaymentGateway oldGateway = new OldPaymentGateway();
        PaymentProcessor paymentProcessor = new PaymentAdapter(oldGateway);

        // Using the new interface with the old system
        paymentProcessor.processPayment("1234-5678-9012-3456", 100.00);
    }
}
