import sun.security.mscapi.CPublicKey;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void startCalculator() {
        Scanner scanner = new Scanner(System.in);

        double one;
        double two;
        int option;

        System.out.print("Write first number: ");

        one = scanner.nextDouble();

        System.out.print("\nWrite second number: ");

        two = scanner.nextDouble();

        System.out.print("\n" +
                "1 - addition\n" +
                "2 - subtraction\n" +
                "3 - multiplication\n" +
                "4 - division\n" +
                "Choose option: ");

        option = scanner.nextInt();

        System.out.print("\nYour result is: ");

        System.out.println(makeCalc(one,two,option));
    }

    public static Object makeCalc(Object one, Object two, int option) {
        switch (option) {
            case 1:
                return MyMath.addition(one, two);
            case 2:
                return MyMath.subtraction(one, two);
            case 3:
                return MyMath.multiplication(one, two);
            case 4:
                return MyMath.division(one, two);
            default:
                return "There is no such option";
        }
    }
}
