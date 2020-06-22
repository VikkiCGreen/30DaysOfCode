package day1;

import java.util.Scanner;

public class DataTypes {

    public void day1Challenge() {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.print("Enter an integer: ");
        i2 = scan.nextInt();
        System.out.print("Enter a double: ");
        d2 = scan.nextDouble();
        System.out.print("Enter a string: ");
        s2 = scan.next() + scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        int sumInt = i + i2;
        System.out.println(sumInt);
        /* Print the sum of the double variables on a new line. */
        double sumDouble = d + d2;
        System.out.println(sumDouble);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        String concatString = s + s2;
        System.out.println(concatString);
    }
}
