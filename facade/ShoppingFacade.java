package facade;

public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private OrderManager orderManager;

    public ShoppingFacade() {
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.orderManager = new OrderManager();
    }

    public void placeOrder(String product, String paymentMethod) {
        productCatalog.checkProductAvailability(product);
        paymentProcessor.processPayment(paymentMethod);
        orderManager.placeOrder(product);
        System.out.println("Order completed successfully!\n");
    }
}

