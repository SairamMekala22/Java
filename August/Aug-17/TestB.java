// package August.Aug-17;

import java.util.Scanner;

public class TestB {
   public static void main(String[] arg) {
    String names[] = new String[5];
    System.out.println("Enter names: ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < names.length; i++) {
        names[i] = sc.next();
    }
    sc.close();
    // for (int i = 0; i < names.length; i++) {
    //     System.out.println("Hello " + names[i]);
    // }
    for (int i = 0; i < names.length; i++) {
        // String key = names[i];
        for (int j = i + 1; j < names.length; j++) {
            // System.out.println(names[i] + "   " + names[j]);
            if (names[i].equals(names[j])) {
                System.out.println(names[i] + " has duplicates");
                break;
            }
        } 
    }

    System.out.println(names[10]);
   }
}
