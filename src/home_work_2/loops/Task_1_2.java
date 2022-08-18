package home_work_2.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1_2 {

    private static boolean isValidNumber = false;
    private static int intValue;

    public static void main(String[] args) {

        System.out.println("PLEASE ENTER AN INTEGER...");
        Scanner consoleValue = new Scanner(System.in);

        while (!isValidNumber) {
            /* TODO: Add Check Method For Empty Data
            if (consoleValue.nextLine().equals("")) {
                System.out.println("You have nothing entered!");
            } else {
                checkValidNumber(consoleValue);
                consoleValue.nextLine();
            }
            */
            checkValidNumber(consoleValue);
        }

        multiplyNumberShowResult(intValue);
    }

    private static void checkValidNumber(Scanner scanValue) {

        if (!scanValue.hasNextInt()) {
            /* to check DOUBLE value */
            if (scanValue.hasNextDouble()) {
                System.out.println(scanValue.nextDouble() + " Your number is NOT an integer!");
            } else {
                String stringValue = scanValue.next();
                /* to check STRING value */
                if (scanValue.hasNextLine() && !doubleValueContainsUnusedFloatingPoint(stringValue)) {
                    System.out.println(stringValue + " is NOT number!");
                }
                /* to check symbol ',' in DOUBLE value */
                else {
                    System.out.println("You use unused symbol ',' for DOUBLE value");
                }
            }
        }

        /* to check INTEGER value */
        else {
            intValue = scanValue.nextInt();
            /* integer value has two digits */
            if (intValue <= 9) {
                System.out.println("Your number has only one digit and cannot be changed after multiplication!");
            }
            /* integer value doesn't contains ZERO digit */
            else if (numberContainsZero(intValue)) {
                System.out.println("Your number contains '0'! Your result after multiplication will be 0");
            }
            else {
                isValidNumber = true;
            }
        }
    }

    /*
    Multiply Numbers & Get Result & Show Result Into Console
     */
    private static void multiplyNumberShowResult(int intValue) {

        Integer[] intArray = new Integer[0];

        int intResult = 1;

        String stringResult = "";

        /*
        Create Integer Array From Received Valid Integer Value
         */
        while (intValue > 0) {
            int arrayValue;
            arrayValue = intValue % 10;
            intArray = appendNewIntegerValueToArray(intArray, arrayValue);
            intValue /= 10;
        }

        for (int i = intArray.length; i > 0; i--) {
            intResult *= intArray[i - 1];
            stringResult += "" + intArray[i - 1];
            if (i != 1) { stringResult += " * "; }
        }

        System.out.println(stringResult + " = " + intResult);
    }


    //Check If Number Contains Zero Digit (RETURN TRUE!)
    private static boolean numberContainsZero(int intValue) {
       return ("" + intValue).contains("0");
    }

    //Check If Double Value Contains NOT Symbol '.', but ','
    private static boolean doubleValueContainsUnusedFloatingPoint(String intValue) {
        return intValue.contains(",");
    }

    /*
    CUSTOM METHOD - Append New Integer Value To Integer Array
    */
    private  static <T> T[] appendNewIntegerValueToArray(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }
}
