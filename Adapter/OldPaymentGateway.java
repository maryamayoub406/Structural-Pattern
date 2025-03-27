package Adapter;

// Old Payment Gateway (Incompatible)
public class OldPaymentGateway {
    public void payWithCard(String cardNumber, double amount) {
        System.out.println("Processing payment of $" + amount + " using card: " + cardNumber);
    }
}

