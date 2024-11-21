package inheritance;

public class Phone {
    int number;
    String model;
    Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }
    void printDetail() {
        System.out.println("Model: " + this.model + " Number: " + this.number);
    }
}
