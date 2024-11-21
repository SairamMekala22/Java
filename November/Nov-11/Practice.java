import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 0) {
            throw new AgeCannotBeNegative();
        }
        System.out.println("Applications ends");
        sc.close();
    }
}
