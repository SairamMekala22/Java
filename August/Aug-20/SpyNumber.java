// package Aug-20;

/*
Write a Java program to print the given number is a spy number or not

A spy number is a number where the sum of its digits equals the product of its digits.
For example, 1124 is a spy number, the sum of its digits is 1+1+2+4=8 
and the product of its digits is 1*1*2*4=8.
Sample Input:
1124
Sample Output:
Spy Number

Sample Input:
111
Sample Output:
Not a Spy Number

*/

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int digitSum = 0;
        int digitProduct = 1;
        while (num > 0) {
            int rem = num % 10;
            digitProduct *= rem;
            digitSum += rem;
            num = Math.floorDiv(num, 10);
        }

        if (digitSum  == digitProduct) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
