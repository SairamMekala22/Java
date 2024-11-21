public class BookStore {
    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println("Title = " + book1.title);
        book1.title = "Harry porter";
        System.out.println("Title = " + book1.title);
        book1.author = "JK rowling";
        book1.price = 45.0;
        book1.numOfCopies = 2;

        Book book2 = new Book();
        book2.title = "Harry porter - 2";
        book2.author = "JK rowling";
        book2.price = 65.0;

        Book book3 = new Book();
        book3.title = "Harry porter";
        book3.author = "JK rowling";
        book3.price = 45.0;

        double earnings = 0;
        book1.applyDiscount(20);
        earnings += book2.sell();
        System.out.println("Today's earnings = " + earnings);
    }
}
