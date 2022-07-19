package home_work_1;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Calendar;      //task_4.6

public class ControlFlowStatementsTaskFour {

    //All functions are performed automatically,
    //please, just enter the data by executing commands from the console
    public static void main(String[] args) {

        //create instance of class OddNumber & call public method
        //enter ONE number in console & get result
        OddNumber task_4_1 = new OddNumber();
        task_4_1.defineOddNumber();

        //create instance of class AverageNumber & call public method
        //enter THREE different numbers in console  & get result
        AverageNumber task_4_2 = new AverageNumber();
        task_4_2.findAverageNumber();

        //create instance of class DivisibleNumbers & call public method
        //enter TWO numbers in console
        DivisibleNumbers task_4_3 = new DivisibleNumbers();
        task_4_3.checkDivisibleNumbers();

        //create instance of class ByteToKiloByteConverter
        //call two public method to convert
        //first method converts bytes to kilobytes
        ByteToKilobyteConverter task_4_4 = new ByteToKilobyteConverter();
        task_4_4.convertBytesTo_Kilobytes();
        task_4_4.convertKilobytesTo_Bytes();

        //create instance of class CheckLetterManager & call public method
        //enter letters or another symbols in console
        CheckLetterManager task_4_5 = new CheckLetterManager();
        task_4_5.inputLetter();

        //create instance of class LeapYearManager & call public method
        //enter number of year & determine what is the year
        LeapYearManager task_4_6 = new LeapYearManager();
        task_4_6.determineLeapYear();
    }
}

// TASK 4.1 ------------------------------------------------------------------
class OddNumber {

    public void defineOddNumber() {

        boolean isNumeric = false;
        int currentValue = 0;

        System.out.println("Define Odd Number - task 4.1");

        while (!isNumeric) {
            System.out.println("Please, Enter integer number...");
            Scanner scannerNumber = new Scanner(System.in);
            isNumeric = checkInputValueIsInteger(scannerNumber);
            if (isNumeric) {
                currentValue = scannerNumber.nextInt();
            }
        }

        if (currentValue % 2 == 0) {
            System.out.println("Current Integer " + currentValue + " is even");
        } else {
            System.out.println("Current Integer " + currentValue + " is odd");
        }

        System.out.println("-------------DONE-------------");
    }

    //Check the entered value is an integer or not
    private static boolean checkInputValueIsInteger(Scanner scannerValue) {
        if (scannerValue.hasNextInt()) {
            return true;
        } else {
            System.out.println("Error! The entered value is not a integer number.");
            return false;
        }
    }
}

// TASK 4.2 ------------------------------------------------------------------
class AverageNumber {

    //Get two entered number from console
    public void findAverageNumber() {

        System.out.println("Find Average Number - task 4.2");

        boolean isNumeric = false;
        int numberOfEnteredValues = 0;
        int[] integersArray = new int[3];

        while (!isNumeric) {
            if (numberOfEnteredValues == 0) {
                System.out.println("Please, Enter first number...");
            } else if (numberOfEnteredValues == 1) {
                System.out.println("Please, Enter second number...");
            } else {
                System.out.println("Please, Enter third number...");
            }

            Scanner scannerNumber = new Scanner(System.in);
            isNumeric = checkInputValueIsInteger(scannerNumber);

            if (isNumeric) {
                int currentEnteredValue = scannerNumber.nextInt();
                integersArray[numberOfEnteredValues] = currentEnteredValue;
            }

            numberOfEnteredValues++;
            isNumeric = numberOfEnteredValues == 3;
        }

        sortThreeNumbers(integersArray);

        System.out.println("-------------DONE-------------");
    }

    //Check the entered value is an integer or not
    private boolean checkInputValueIsInteger(Scanner scannerValue) {
        if (scannerValue.hasNextInt()) {
            return true;
        } else {
            System.out.println("Error! The entered value is not a number.");
            return false;
        }
    }

    //Sort numbers in array
    private static void sortThreeNumbers(int[] unsortedArray) {
        int[] sortedArray = {};
        Arrays.sort(unsortedArray);
        sortedArray = unsortedArray;
        System.out.println("Average number is " + sortedArray[1]);
    }
}

// TASK 4.3 ------------------------------------------------------------------
class DivisibleNumbers {

    public void checkDivisibleNumbers() {

        System.out.println("Determine If Numbers Are Divisible - task 4.3");

        boolean isNumeric = false;
        int numberOfEnteredValues = 0;
        int[] integersArray = new int[2];

        while (!isNumeric) {
            if (numberOfEnteredValues == 0) {
                System.out.println("Please, Enter first number...");
            } else {
                System.out.println("Please, Enter second number...");
            }

            Scanner scannerNumber = new Scanner(System.in);
            isNumeric = checkInputValueIsInteger(scannerNumber);

            if (isNumeric) {
                int currentEnteredValue = scannerNumber.nextInt();
                integersArray[numberOfEnteredValues] = currentEnteredValue;
            }

            numberOfEnteredValues++;
            isNumeric = numberOfEnteredValues == 2;
        }

        divideTwoNumbers(integersArray);

        System.out.println("-------------DONE-------------");
    }

    //Check the entered value is an integer or not
    private boolean checkInputValueIsInteger(Scanner scannerValue) {
        if (scannerValue.hasNextInt()) {
            return true;
        } else {
            System.out.println("Error! The entered value is not a number.");
            return false;
        }
    }

    private void divideTwoNumbers(int[] divisibleNumbers) {

        if (divisibleNumbers[1] == 0) {
            System.out.println("Error! Cannot be divided by 0");
            return;
        }

        if (divisibleNumbers[0] % divisibleNumbers[1] == 0) {
            System.out.println("Division of " + divisibleNumbers[0]
                    + " by " + divisibleNumbers[1] + " is divisible");
        } else {
            int reminder = divisibleNumbers[0] % divisibleNumbers[1];
            System.out.println("Division of " + divisibleNumbers[0]
                    + " by " + divisibleNumbers[1]
                    + " is divisible, but numbers are divisible with a remainder - "
                    + reminder);
        }
    }
}

// TASK 4.4 ------------------------------------------------------------------
class ByteToKilobyteConverter {

    final private int bytesInKilobytes = 1024;
    final private DecimalFormat df = new DecimalFormat("0.00");
    private boolean isValidNumber = false;
    private double kilobytesNumber;
    private long bytesNumber;


    //method to convert bytes to kilobytes
    public void convertBytesTo_Kilobytes() {


        System.out.println("Convert bytes to Kilobytes & Kilobytes top bytes - task 4.4");
        System.out.println("***");

        System.out.println("Please enter number in bytes");

        while (!isValidNumber) {
            Scanner scannerValue = new Scanner(System.in);
            isValidNumber = checkScannerValueForBytes(scannerValue);

            if (isValidNumber) {
                bytesNumber = scannerValue.nextLong();
            }
        }

        kilobytesNumber = bytesNumber * 1.0 / bytesInKilobytes;

        //Show result after converting values for different states
        if (kilobytesNumber == Math.round(kilobytesNumber)) {
            int intRoundedResult = (int) kilobytesNumber;
            System.out.println(bytesNumber + " bytes equal - " + intRoundedResult + "Kb");
        } else {
            System.out.println(bytesNumber + " bytes equal - " + df.format(kilobytesNumber) + "Kb");
        }

        isValidNumber = false;
        kilobytesNumber = 0;
        bytesNumber = 0;
    }

    private boolean checkScannerValueForBytes(Scanner scannerValue) {
        if (!scannerValue.hasNextInt()) {
            System.out.println("You've entered not valid number!");
            return false;
        } else {
            return true;
        }
    }

    //method to convert kilobytes to bytes
    public void convertKilobytesTo_Bytes() {

        System.out.println("Please enter number in Kilobytes");

        while (!isValidNumber) {
            Scanner scannerValue = new Scanner(System.in);
            isValidNumber = checkScannerValueForKilobytes(scannerValue);

            if (isValidNumber) {
                kilobytesNumber = scannerValue.nextDouble();
            }
        }

        if (kilobytesNumber == Math.round(kilobytesNumber)) {
            bytesNumber = (long) kilobytesNumber * bytesInKilobytes;
            System.out.println((int) kilobytesNumber + "Kb equals " + bytesNumber + " bytes");
        } else {
            bytesNumber = Math.round(kilobytesNumber * bytesInKilobytes);
            System.out.println(kilobytesNumber + "Kb equals " + bytesNumber + " bytes");
        }

        isValidNumber = false;
        kilobytesNumber = 0;
        bytesNumber = 0;

        System.out.println("-------------DONE-------------");
    }

    private boolean checkScannerValueForKilobytes(Scanner scannerValue) {
        if (!scannerValue.hasNextInt() && !scannerValue.hasNextDouble()) {
            System.out.println("You've entered not number!");
            return false;
        } else {
            return true;
        }
    }
}

// TASK 4.5 ------------------------------------------------------------------
class CheckLetterManager {

    public void inputLetter() {

        System.out.println("Input Seven Letters - task 4.5");

        boolean isLetter = false;

        while (!isLetter) {
            Scanner scannerValue = new Scanner(System.in);
            isLetter = checkInputValueIsLetter(scannerValue);
        }

        System.out.println("-------------DONE-------------");
    }

    //Check the entered value
    private boolean checkInputValueIsLetter(Scanner scannerValue) {

        if (scannerValue.hasNextInt()) {
            System.out.println("You entered NUMBER!!!");
            return false;
        } else if (scannerValue.hasNext()) {
            String enteredValue = scannerValue.next().toLowerCase();
            if (enteredValue.charAt(0) >= 'a' && enteredValue.charAt(0) <= 'z') {
                System.out.println("You've entered LETTER))");
                return true;
            } else {
                System.out.println("You are trying enter a SYMBOL");
                return false;
            }
        }
        return false;
    }
}

// TASK 4.6 ------------------------------------------------------------------
class LeapYearManager {

    private int validEnteredYear;

    /*
        as an experiment, the value of the year will be valid from 1800 to 2100
     */
    public void determineLeapYear() {

        boolean isValidYearNumber = false;
        boolean isLeapEnteredYear = false;

        System.out.println("Leap Year - Task 4.6");
        System.out.println("Please enter a year number to see if this year is a leap year");

        while (!isValidYearNumber) {
            Scanner scannerValue = new Scanner(System.in);
            isValidYearNumber = checkYearNumber(scannerValue);
            if (isValidYearNumber) {
                isLeapEnteredYear = isLeapYear(validEnteredYear);
            }
        }

        if (isLeapEnteredYear) {
            System.out.println(validEnteredYear + " year is leap year");
        } else {
            System.out.println(validEnteredYear + " year is not leap year");
        }

        System.out.println("-------------DONE-------------");
    }

    private boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    private boolean checkYearNumber(Scanner scannerValue) {
        if (scannerValue.hasNextInt()) {
            validEnteredYear = scannerValue.nextInt();
            if ((validEnteredYear >= 1800) && (validEnteredYear <= 2100)) {
                return true;
            } else {
                System.out.println("Please enter valid value. It will be valid from 1800 to 2100");
                return false;
            }
        } else {
            System.out.println("You've entered not a year number");
            return false;
        }
    }
}
