public class Book{
    float price;
    int noOfCopies;
    String name;
    // void printBookDetails() {

    // }

    boolean sell(Person p) {
        if (noOfCopies > 0 && p.buyBook(this.name)) {
            noOfCopies--;
            System.out.println("Congratulations, " + p.name + " bought a copy of " + name + ".");
            p.totalBooks.add(this);
            return true;
        } else if (!(p.buyBook(this.name))) {
            System.out.println("You have alredy bought " + name + ".");
            return false;
        } else {
            System.out.println("Sorry, " + name + " is out of stock.");
            return false;
        }
    }

    Book(String name, float price, int noOfCopies) {
        this.name = name;
        this.price = price;
        this.noOfCopies = noOfCopies;

    }
}