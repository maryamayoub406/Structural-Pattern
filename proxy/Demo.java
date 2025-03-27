package proxy;

public class Demo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_10mb.jpg");

        // Image will be loaded from disk and displayed
        image1.display();
        
        System.out.println("");

        // Image will not be loaded again, only displayed
        image1.display();
    }
}

