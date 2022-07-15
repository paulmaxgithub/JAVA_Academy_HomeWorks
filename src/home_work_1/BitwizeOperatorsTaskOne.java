package home_work_1;

import java.util.Scanner;

public class BitwizeOperatorsTaskOne {

    static private int inputIntegerNumber = 0;
    static  private int numberOfEnteredValues = 0;

    public static void main(String[] args) {
        int numberOne = getEnteredNumberFromConsole();
        int numberTwo = getEnteredNumberFromConsole();

        /* The resulting bit resulting from the execution of the 'AND / &' operator
         * equals 1 if the corresponding bits in the operands are also 1.
         * In all other cases, the value of the resulting bit is 0.
         *
         * Example:
         *   00101010 = 42
         * & 00001111 = 15
         * ---------------
         *   00001010 = 10
         */
        int resultWith_AND = numberOne & numberTwo;

        /* The resulting bit resulting from the execution of the 'OR / |' operator
         * equals 1 if the corresponding bit in any of the operands is 1.
         *
         * Example:
         *   00101010 = 42
         * | 00001111 = 15
         * ---------------
         *   00101111  47
         */
        int resultWith_OR = numberOne | numberTwo;

        System.out.println("Result Bitwise AND - " + resultWith_AND);
        System.out.println("Result Bitwise OR - " + resultWith_OR);
    }

    //Get two entered number from console
    private static int getEnteredNumberFromConsole() {

        boolean isNumber = false;

        while (!isNumber) {
            if (numberOfEnteredValues == 0) {
                System.out.println("Please, Enter first number...");
            } else {
                System.out.println("Please, Enter second number...");
            }
            Scanner scannerNumber = new Scanner(System.in);
            isNumber = checkInputValueIsInteger(scannerNumber);
            if (isNumber) {
                inputIntegerNumber = scannerNumber.nextInt();
            }
        }
        numberOfEnteredValues++;

        return inputIntegerNumber;
    }

    //Check the entered value is an integer or not
    private static boolean checkInputValueIsInteger(Scanner scannerValue) {
        if (scannerValue.hasNextInt()) {
            return true;
        } else {
            System.out.println("Error! The entered value is not a number.");
            return false;
        }
    }
}