package day5;

import java.util.Scanner;

public class Loops {
/*    Given an integer, n, print its first 10 multiples.
Each multiple n x i (where 1 <= i <= 10 ) should be printed on a new line in the form: n x i = result.
*/
    private static final Scanner scanner = new Scanner(System.in);
    public void day5Challenge() {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}
