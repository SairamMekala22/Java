// package Aug-20;


/*
Write a Java Program to find the given number is neon or not a neon number.
Hint:
A neon number is a number where the sum of digits of square of the number is equal to the number. 
For example if the input number is 9, its square is 9*9 = 81 and sum of the digits is 9. i.e.
9 is a neon number

Sample Input-Output:
input=
9
output=
Neon Number

input=
12
output=
Not a Neon Number

*/

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int numSquare = num * num;
        int squareSum = 0;
        while (numSquare > 0) {
            int rem = numSquare % 10;
            squareSum += rem;
            numSquare = Math.floorDiv(numSquare, 10);
        }

        if (squareSum == num) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}
