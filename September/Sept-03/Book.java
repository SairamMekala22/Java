public class Book {
    String title;
    int numOfCopies;
    double price; 
    String author;
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
    }

    public double sell() {
        if (numOfCopies > 0) {
            numOfCopies -= 1;
            System.out.println("Congratulations! you have bought " + title + " by " + author + " for " + price);
            return price;
        } else {
            System.out.println("Out of stock");
            return 0;
        }
    }

    public void applyDiscount(float discount) {
        price = price - (price * (discount / 100.0));
    }
 
}