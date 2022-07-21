package home_work_2.loops;

import java.util.Scanner;

public class Task_1_1 {

    private static boolean isValidNumber = false;
    private static int multipliedNumber = 0;

    public static void main(String[] args) {

        System.out.println("Please Enter An Integer");

        while (!isValidNumber) {
            Scanner scannerValue = new Scanner(System.in);
            isValidNumber = checkValidNumber(scannerValue);
        }

        String multipliedResult = multiplyNumbers(multipliedNumber);
        System.out.println(multipliedResult);
    }

    private static String multiplyNumbers(int number) {

        int intResult = 1;
        StringBuilder stringResult = new StringBuilder(Integer.toString(intResult));

        for (int i = intResult; i <= number; i++) {

            intResult *= i;

            if (i == number) {
                return stringResult + " = " + intResult;
            } else {
                stringResult.append(" * ").append(++i);
                --i;
            }
        }

        return "";
    }

    private static boolean checkValidNumber(Scanner scannerValue) {
        if (scannerValue.hasNextInt()) {
            multipliedNumber = scannerValue.nextInt();
            return true;
        } else {
            System.out.println("Please Enter A Number");
            return false;
        }
    }
}
