package day0;

import java.util.Scanner;

public class HelloWorld {

    public void printString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any input: ");
        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
