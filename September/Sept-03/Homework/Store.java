// package Homework;
// package Homework;

public class Store {
    public static void main(String[] args) {
        Product product1 = new Product("Harry porter", 12, 75.0);
        Product product2 = new Product("The Avengers", 5, 60);
        Product product3 = new Product("Ironman", 7, 90);

        // Customer-1
        product2.buy();
        product3.buy();
        product3.buy();
        product3.buy();
        product3.buy();

        // Customer-2
        product1.buy();
        product2.buy();
        product3.buy();
        product3.buy();
        product3.buy();
        product3.buy();

        // Customer-3
        for (int i = 0; i < 10; i++) {
            product1.buy();
        }

        // Customer-4
        for (int i = 0; i < 5; i++) {
            product1.buy();
        }


    }
}
