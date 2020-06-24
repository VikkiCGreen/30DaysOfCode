package day3;

import java.util.Scanner;

public class ConditionalStatements {

/*    Given an integer, n, perform the following conditional actions:
    1. If n is odd, print Weird
    2. If n is even and in the inclusive range of 2 to 5, print Not Weird
    3. If n is even and in the inclusive range of 6 to 20, print Weird
    4. If n is even and greater than 20, print Not Weird
    Constraints: 1 <= n <= 100

*/

    public void day3Challenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in an integer");
        int N = scanner.nextInt();
        solve(N);
        scanner.close();
    }

    private void solve(int N) {
        if (N >= 1 && N <= 100) {
            if ((N % 2) != 0) {
                System.out.println("Weird");
            } else if ((N >= 2 && N <= 5)) {
                System.out.println("Not Weird");
            } else if ((N >= 6 && N <= 20)) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
