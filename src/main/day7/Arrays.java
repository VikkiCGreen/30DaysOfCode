package day7;

import java.util.Scanner;

public class Arrays {

/*    Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
*       Sample Input:
*               4
*               1 4 3 2
*
*       Sample Output
*               2 3 4 1
*
*  */

    private static final Scanner scanner = new Scanner(System.in);

    public void day7Challenge() {

        System.out.println("enter size of array: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        System.out.println("enter array values separated by a space: ");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int j = n;
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[j - 1] = arrItem;
            j = j - 1;
        }

        StringBuilder reverseArray = new StringBuilder();

        for (int k = 0; k < n; k++) {
            reverseArray.append(arr[k]).append(" ");
        }
        System.out.println(reverseArray.toString());

        scanner.close();
    }
}
