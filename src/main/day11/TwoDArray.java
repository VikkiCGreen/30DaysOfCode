package day11;

import java.util.Scanner;

public class TwoDArray {

/*    Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
*
* We define an hourglass in A to be a subset of values with indices falling
* in this pattern in A's graphical representation:
* */

    private static final Scanner scanner = new Scanner(System.in);

    public void day11Challenge() {

        int[][] arr = new int[6][6];

        for (int row = 0; row < 6; row++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int col = 0; col < 6; col++) {
                int arrItem = Integer.parseInt(arrRowItems[col]);
                arr[row][col] = arrItem;
            }
        }

        int max_sum = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = 0;
                sum += arr[row][col];
                sum += arr[row][col+1];
                sum += arr[row][col+2];
                sum += arr[row+1][col+1];
                sum += arr[row+2][col];
                sum += arr[row+2][col+1];
                sum += arr[row+2][col+2];

                max_sum = Math.max(max_sum, sum);
            }
        }
        System.out.println(max_sum);

        scanner.close();

    }

}
