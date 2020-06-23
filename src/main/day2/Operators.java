package day2;

import java.util.Scanner;

public class Operators {

/*    Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
    and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. */

    public void day2Challenge() {
        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double totalCost;
        double tip =  (meal_cost * ((double)tip_percent/100));
        double tax =  (meal_cost * ((double)tax_percent/100));
        totalCost = (meal_cost + tip + tax);
        totalCost = Math.round(totalCost);
        int total = (int) totalCost;
        System.out.println(total);
    }
}
