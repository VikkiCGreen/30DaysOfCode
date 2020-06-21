import day0.HelloWorld;

import java.util.Scanner;

public final class UserInputUtils {

    public static int getInputDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the challenge day you'd like to run (between 0 and 29): ");
        int day = 0;
        if (scanner.hasNextInt()) {
            day = scanner.nextInt();
            if (day >= 0 && day <= 29) {
                getChallenge(day);
            } else {
                System.out.println("Input must be between 0 and 29");
                getInputDay();
            }
        } else if (!scanner.hasNextInt()) {
            System.out.println("Must be an integer");
            getInputDay();
        } else {
            scanner.close();
        }
        return day;
    }

    public static void getChallenge(int inputDay) {
        switch (inputDay) {
            case 0:
                HelloWorld helloWorld = new HelloWorld();
                helloWorld.printString();
                break;
            case 1:
                //TODO:
                break;
            //TODO: ...
            default:
                getInputDay();
                break;
        }
    }

}
