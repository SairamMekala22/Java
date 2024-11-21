public class Test{
    public static void main(String[] args) {
        Product p1 = new Product("liril", "HL", 2, 30);
        // p1.title = "liril";
        // p1.price = 30;
        // p1.brand = "HL";
        // p1.stock = 2;
        
        Product p2 = new Product("Campa", "Reliance", 15, 20);
        // p2.title = "Campa";
        // p2.price = 20;
        // p2.brand = "Reliance";
        // p2.stock = 15;
        
        Product p3 = new Product("Lays", "ITC", 2, 10);
        // p3.title = "Lays";
        // p3.price = 10;
        // p3.brand = "ITC";
        // p3.stock = 10;
        
        // Customer - 1
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
    }
}