import java.util.ArrayList;
public class Person {
    String name; 
    int age;
    String gender;
    int noOfBooksBought = 0;
    ArrayList<Book> totalBooks = new ArrayList<Book>();
    ArrayList<String> books = new ArrayList<String>();
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    boolean buyBook(String name) {
        boolean duplicate = false;
        for (String i: books){
            if (name == i) {
                duplicate = true;
            }
        } 
        if (duplicate == false) {
            noOfBooksBought++;
            books.add(name);
            
            return true;
        } else {
            return false;
        }
    }


}
