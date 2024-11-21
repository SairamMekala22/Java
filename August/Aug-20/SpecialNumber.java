// package Aug-20;

/*
Write a java program to check whether a given number is a special number or not.

A number is said to be special number when the sum of factorial of its digits is 
equal to the number itself. 
Example- 145 is a Special Number as 1!+4!+5!=145.

Sample Input1:
145
Sample Output1:
Special Number

Sample Input2:
345
Sample Output2:
Not a Special Number
*/

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int dum = num;
        int factorialSum = 0;
        while (dum > 0) {
            int rem = dum % 10;
            int fac = 1;
            for (int i = 1; i <= rem; i++) {
                fac *= i;
            }
            factorialSum += fac;
            dum = Math.floorDiv(dum, 10);
        }

        if (factorialSum == num) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a Special Number");
        }
    }
}
