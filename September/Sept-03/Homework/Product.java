// package Homework;
// package Homework;

public class Product {
    String title;
    int numOfCopies;
    double price;
    int totalCopies;
    public Product(String title, int numOfCopies, double price) {
        this.title = title;
        this.numOfCopies = numOfCopies;
        this.price = price;  
        this.totalCopies = numOfCopies;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public void buy() {
        if (numOfCopies > 0) {
            numOfCopies -= 1;
            System.out.println("You have bought " + title);
        } else {
            restock();
        }
    }

    public void restock() {
        numOfCopies = totalCopies;
    }

    public void applyDiscount(float discount) {
        price = price - (price * (discount / 100.0));
    }

    
}
