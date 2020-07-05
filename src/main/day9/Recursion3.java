package day9;

import java.util.Scanner;

public class Recursion3 {

/*
Write a factorial function that takes a positive integer, N
as a parameter and prints the result of N!(N factorial).
*/

    private static final Scanner scanner = new Scanner(System.in);

    public void day9Challenge() {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);
        scanner.close();
    }

    //N! .. 4! .. 4 * 3 * 2 * 1
    static int factorial(int n) {
        //recursive case
        if (n > 1) {
            return n * factorial(n-1);
        }
        //base case
        else {
            return 1;
        }
    }

}
