package home_work_2.loops;

import java.util.Scanner;

public class Task_1_3 {

    private static double validNumber;
    private static int exponentValue;
    private static double exponentiatedResult = 1;

    private static int numbersCount = 0;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        while (numbersCount != 2) switch (numbersCount) {
            case 0:
                System.out.println("Please, enter negative, positive or fractional number...");
                checkNumberFromConsole(console);
                break;
            case 1:
                System.out.println("Please, enter degrees for the entered number...");
                checkNumberFromConsole(console);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + numbersCount);
        }

        //Get Result
        exponentiate();

        //Show Result into Console
        System.out.println(validNumber + " ^ " + exponentValue + " = " + exponentiatedResult);
    }

    private static void exponentiate() {
        for (int i = 0; i < exponentValue; i++) exponentiatedResult *= validNumber;
    }

    /*
    check entered value for:
    • double, integer value
    • for zero value
    • for string
    • unexpected values
     */
    private static void checkNumberFromConsole(Scanner scannerValue) {

        String enteredValue = scannerValue.nextLine();

        switch (numbersCount) {
            case 0:
                if ((isDouble(enteredValue) || isInt(enteredValue)) && !enteredValue.equals("0")) {
                    validNumber = Double.parseDouble(enteredValue);
                    numbersCount++;
                } else {
                    if (enteredValue.equals("0")) {
                        System.out.println("You've entered '0'!");

                    } else if (enteredValue.contains(",")) {
                        System.out.println("Your value contains symbol ',' for DOUBLE value");
                    } else {
                        System.out.println("You've entered NOT number!");
                    }
                }
                break;
            case 1:
                if (isInt(enteredValue) && !enteredValue.equals("0")) {
                    exponentValue = Integer.parseInt(enteredValue);
                    numbersCount++;
                } else {
                    if (enteredValue.equals("0")) {
                        System.out.println("You've entered '0'!");
                    } else if (isDouble(enteredValue)) {
                        System.out.println("You've entered DOUBLE value!");
                    } else {
                        System.out.println("You've entered NOT number!");
                    }
                }
                break;
        }
    }

    /*
    Use Custom Methods To Verify Valid Integer or Double Values
     */
    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
