package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Review1 {
/*    Given a string, S , of length N that is indexed from 0 to N - 1,
    print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line
    (see the Sample below for more detail).
    Note:
    is considered to be an even index.

    Input Format
    The first line contains an integer, T (the number of test cases).
    Each line i of the T subsequent lines contain a String, S.
    Constraints: 1<=T<=10 ; 2<=length of S <=10000
*/

    public void day6Challenge() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            int N = S.length();
            char[] array = S.toCharArray();
            StringBuilder evens = new StringBuilder();
            StringBuilder odds = new StringBuilder();

            for (int j = 0; j < N; j++) {
                List<String> arrayListEvens = new ArrayList<>();
                List<String> arrayListOdds = new ArrayList<>();
                if (j % 2 == 0) {
                    evens.append(array[j]);
                    arrayListEvens.add(evens.toString());
                } else {
                    odds.append(array[j]);
                    arrayListOdds.add(odds.toString());
                }
            }
            System.out.println(evens + " " + odds);
        }
        sc.close();
    }
}
