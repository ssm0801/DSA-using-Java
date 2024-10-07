package Java_Basics;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte num;

        System.out.println("Enter number between 1 to 7 inclusive = ");
        num = scanner.nextByte();

        // enhanced switch can only be used in jdk 14+
        switch (num) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid input");
        }

        scanner.close();
    }
}
