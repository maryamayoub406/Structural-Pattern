package facade;

public class facademain {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.placeOrder("Laptop", "Credit Card");
        shoppingFacade.placeOrder("Headphones", "Debit Card");
    }
}
