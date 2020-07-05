package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNumbers {

/*
    Given a base-10 integer, n, convert it to binary (base-2).
    Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

    while(n > 0):
    remainder = n%2;
    n = n/2;
    Insert remainder to front of a list or push onto a stack

    Print list or stack*/

    private static final Scanner scanner = new Scanner(System.in);

    public void day10Challenge() {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> remainders = new ArrayList<>();

        while (n > 0) {
            int remainder = n % 2;
            remainders.add(remainder);
            n = n/2;
        }

        int count = 1;
        int max = 1;
        for (int i = 0; i < remainders.size()-1; i++) {
            int tempMax = 0;
            if (remainders.get(i).equals(remainders.get(i + 1))) {
                count++;
                tempMax = count;
                if (tempMax > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
