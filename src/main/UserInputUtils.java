import day0.HelloWorld;
import day1.DataTypes;

import java.util.Scanner;

public final class UserInputUtils {

    private UserInputUtils() {}

    public static void getInputDay() {
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
    }

    public static void getChallenge(int inputDay) {
        switch (inputDay) {
            case 0:
                HelloWorld helloWorld = new HelloWorld();
                helloWorld.day0Challenge();
                break;
            case 1:
                DataTypes dataTypes = new DataTypes();
                dataTypes.day1Challenge();
                break;
            case 2:
                break;
            //TODO: ...
            default:
                getInputDay();
                break;
        }
    }

}
