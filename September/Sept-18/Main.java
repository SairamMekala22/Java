// import java.util.*;

// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person jaffa = new Person("Jaffa", 19, "male");
        Person alex = new Person("alex", 15, "female");
        Book HP = new Book("Harry porter", 70, 15);
        Book avengers = new Book("Avengers", 105, 12);
        HP.sell(alex);
        HP.sell(jaffa);
        HP.sell(jaffa);
        avengers.sell(jaffa);
        System.out.println(jaffa.books);
        /*
        System.out.println("total books:");
        for (Book i: jaffa.totalBooks){
            System.out.println(i.name);
            System.out.println(i.price);
            System.out.println("------------");
        }
        */
    }
}
