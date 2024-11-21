import java.util.*;
public class DetermineSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        sc.close();
        if (month == 1) {
            System.out.println("Season: Winter");
        } else if (month == 2) {
            System.out.println("Season: Winter");
        } else if (month == 3) {
            System.out.println("Season: Spring");
        } else if (month == 4) {
            System.out.println("Season: Spring");
        } else if (month == 5) {
            System.out.println("Season: Spring");
        } else if (month == 6) {
            System.out.println("Season: Summer");
        } else if (month == 7) {
            System.out.println("Season: Summer");
        } else if (month == 8) {
            System.out.println("Season: Summer");
        } else if (month == 9) {
            System.out.println("Season: Autumn");
        } else if (month == 10) {
            System.out.println("Season: Autumn");
        } else if (month == 11) {
            System.out.println("Season: Autumn");
        } else if (month == 12) {
            System.out.println("Season: Winter");
        } else {
            System.out.println("Season: Invalid month number");
        }

    }    
}
