public class Person {
    static int counter = 10;
    Person() {
        counter++;
    }
    static void helloWorld() {
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        System.out.println("Pika pika");
        // System.out.println(args[0] + "   " + args[1]);
    }
}