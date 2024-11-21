// 1.Imagine a simple Car Driving application. We have two independent classes:

// Car: Represents a car with attributes like speed and methods to accelerate or decelerate.

// Driver: Represents a driver who can instruct a car to accelerate or decelerate, 
// but the Driver class does not own the Car, 
// nor does the Car class have a reference to the Driver.
class Car {
    private int speed;
    public Car() {
        this.speed = 0; // Car starts at a speed of 0
    }
    // Method to accelerate the car
    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Car is accelerating. Current speed: " + speed + " km/h");
    }    // Method to decelerate the car
    public void decelerate(int decrease) {
        speed -= decrease;
        if (speed < 0) {
            speed = 0; // Speed can't go below 0
        }
        System.out.println("Car is decelerating. Current speed: " + speed + " km/h");
    }

    // Method to get the current speed of the car
    public int getSpeed() {
        return speed;
    }
}

class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    // Method to drive the car (interaction with Car object via method call)
    public void driveCar(Car car, int speedChange) {
        if (speedChange > 0) {
            System.out.println(name + " is accelerating the car.");
            car.accelerate(speedChange);  // Driver interacts with Car but doesn't have a reference to it
        } else {
            System.out.println(name + " is decelerating the car.");
            car.decelerate(-speedChange); // Negative value means deceleration
        }
    }
}

public class DrivingApp {
    public static void main(String[] args) {
      
    }
}
// Output:
// Do the following : 
// 1. Shamu drives nano , elitos and merceded , he races up nano and elitos to 100, and mercedes to 150 but due to traffic rules he need to speed down mercedes by 100 again
// 2. Shamu and Ramu drive the same car but at day and night consecutively , shamu drives the car fast and ramu does not exceed beyond 80
// 3. Kiran drives maruthi and his wife drives swift , swift is always faster than maruthi
// 4. Priya drives her car very fast , she goes from 10 kmph to 100 kmph in 2 minutes
// but suddenly a tree fells off and priya stops her car

// 2.
// We have two independent classes, Book and Librarian. The Librarian interacts with the Book by checking its availability. The two classes are completely independent and only interact through method calls.

// Example:


class Book {
    private String title;
    private boolean isAvailable;

    public Book(String title, boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }

    // Method to check if the book is available
    public boolean checkAvailability() {
        return isAvailable;
    }

    // Method to get the title of the book
    public String getTitle() {
        return title;
    }
}

class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

	void issueBook(Book b)
	{
		if (b.isAvaila)
			book kfjkdjflskdjflksdjf
			b.isAvailable = false
	

	}









    // Method for the librarian to check the book's availability
    public void checkBookAvailability(Book book) {
        if (book.checkAvailability()) {
            System.out.println(name + " says the book \"" + book.getTitle() + "\" is available.");
        } else {
            System.out.println(name + " says the book \"" + book.getTitle() + "\" is not available.");
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Great Gatsby", true);

        // Create a Librarian object
        Librarian librarian = new Librarian("Emma");

        // Librarian checks if the book is available
        librarian.checkBookAvailability(book);
    }
}


Output:

Implment issueBook and returnBook and then implement the scenarios given below : 
1. There are 3 books A, B,C nancy borrow A ,C and william wants to borrow A , B 
