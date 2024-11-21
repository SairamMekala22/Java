public class Animal {
    String name;
    String breed;

    Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void printDetails() {
        System.out.println("Name: " + this.name + " Breed: " + this.breed);
    }
}
