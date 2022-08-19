package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task_1_5 {

    private static final Random random = new Random();

    public static void main(String[] args) {

        //TODO: uncomment the code to execute program of task 1.5.1 and enter 'Run'
//        findMaxDigitInIntegerValueWith(random.nextInt(Integer.MAX_VALUE));

        //TODO: uncomment the code to execute program of task 1.5.2 and enter 'Run'
//        determineProbabilityOfEvenRandomNumbers();

        //TODO: uncomment the code to execute program of task 1.5.3 and enter 'Run'
//        countEvenAndOddDigitsOfNumber(random.nextInt(Integer.MAX_VALUE));

        //TODO: uncomment the code to execute program of task 1.5.4 and enter 'Run'
//        defineAndDisplayFibonacciSeries(10);

        //TODO: uncomment the code to execute program of task 1.5.5 and enter 'Run'
//        outputRangeOfNumbersWithStep();

        //TODO: uncomment the code to execute program of task 1.5.6 and enter 'Run'
//        flipNumber();
    }

    /*
    task 1.5.1
    */
    private static void findMaxDigitInIntegerValueWith(int intRandomValue) {

        int integerResult = 0;
        int currentIntegerValue = intRandomValue;

        while (intRandomValue > 0) {

            if (integerResult < intRandomValue % 10) {
                integerResult = intRandomValue % 10;
            }
            if (integerResult == 9) break;
            intRandomValue /= 10;
        }

        System.out.println("Max digit of value " + currentIntegerValue + " is " + integerResult);
    }

    /*
    task 1.5.2
    */
    private static void determineProbabilityOfEvenRandomNumbers() {
        int evenNumberCounter = 0;
        determineProbabilityOfEvenRandomNumbers(
                random.nextInt(Integer.MAX_VALUE), 1000, evenNumberCounter);
    }

    //to use default value for 'evenNumberCounter' we overload this method
    private static void determineProbabilityOfEvenRandomNumbers(int intRandomValue,
                                                                int numbersCount,
                                                                int evenNumberCounter) {

        if (intRandomValue % 2 == 0) evenNumberCounter++;

        if (numbersCount == 0) {
            int result = evenNumberCounter * 100 / 1000;
            System.out.println("The probability of even random numbers out of "
                    + 1000 + " is " + result + " %");
        } else {
            determineProbabilityOfEvenRandomNumbers(random.nextInt(Integer.MAX_VALUE),
                    numbersCount - 1, evenNumberCounter);
        }
    }

    /*
    task 1.5.3
    */
    private static void countEvenAndOddDigitsOfNumber(int randomIntValue) {

        int mutableNumber = randomIntValue;
        int evenNumberCounter = 0, oddNumberCounter = 0;

        while (mutableNumber > 0) {
            if ((mutableNumber % 10) % 2 == 0) {
                evenNumberCounter++;
            } else {
                oddNumberCounter++;
            }
            mutableNumber /= 10;
        }

        System.out.println("Number " + randomIntValue + " contains " + evenNumberCounter
                + " of even numbers" + " & " + oddNumberCounter + " of odd numbers");
    }

    /*
    task 1.5.4
    */
    private static void defineAndDisplayFibonacciSeries(int count) {

        int firstValue = 0;
        int secondValue = 1;
        String stringResult = "";

        while (count > 0) {

            //add result to string value
            stringResult += "" + firstValue;
            if (count == 1) break;
            stringResult += " - ";
            count--;

            int nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }

        System.out.println(stringResult);
    }

    /*
    task 1.5.5
    */
    private static void outputRangeOfNumbersWithStep() {

        int numOne = 0, numTwo = 0, withStep = 0, counter = 0;

        Scanner console = new Scanner(System.in);

        while (counter < 3) {
            switch (counter) {
                case 0:
                    System.out.println("Please, enter first INTEGER number...");
                    numOne = checkValueFromConsole(console);
                    if (!isValidIntegerInRangeOfCondition(numOne, numTwo, withStep, counter)) counter--;
                    break;
                case 1:
                    System.out.println("Please, enter second INTEGER number...");
                    numTwo = checkValueFromConsole(console);
                    if (!isValidIntegerInRangeOfCondition(numOne, numTwo, withStep, counter)) counter--;
                    break;
                case 2:
                    System.out.println("Please, enter third INTEGER number for step...");
                    withStep = checkValueFromConsole(console);
                    if (!isValidIntegerInRangeOfCondition(numOne, numTwo, withStep, counter)) counter--;
                    break;
            }
            counter++;
        }

        outputRangeOfNumbersWithStep(numOne, numTwo, withStep);
    }

    // Get result into console
    private static void outputRangeOfNumbersWithStep(int firstValue, int secondValue, int step) {

        String stringResult = "";

        while (firstValue <= secondValue) {
            stringResult += "" + firstValue;
            firstValue += step;
            if (firstValue <= secondValue) stringResult += " ";
        }

        System.out.println(stringResult);
    }

    //first check if value is INTEGER
    private static int checkValueFromConsole(Scanner console) {

        String stringValue = console.nextLine();
        int validInt = 0;

        try {
            Integer.parseInt(stringValue);
            validInt = Integer.parseInt(stringValue);
        } catch (Exception error) {
            System.out.println(error);
            System.out.println("You've entered NOT a integer!");
        }
        return validInt;
    }

    //second check if number is valid in range of condition
    private static boolean isValidIntegerInRangeOfCondition(int numFirst, int numLast, int step, int counter) {

        boolean isValidIntegerValue = false;

        switch (counter) {
            case 0:
                if (numFirst < 1) {
                    System.out.print("You've entered number less then 1! ");
                } else {
                    isValidIntegerValue = true;
                }
                break;
            case 1:
                if (numLast < 1) {
                    System.out.print("You've entered number less then 1! ");
                } else if (numLast <= numFirst) {
                    System.out.print("You've entered number less then first value or equal");
                } else {
                    isValidIntegerValue = true;
                }
                break;
            case 2:
                if (step < 1) {
                    System.out.print("You've entered number less then 1! ");
                } else if (step > numLast) {
                    System.out.print("You've entered number more then last value - " + numLast + "! ");
                } else if (step > (numLast - numFirst)) {
                    int range = numLast - numFirst;
                    System.out.print("You must enter a number less than " + range + "! ");
                } else {
                    isValidIntegerValue = true;
                }
                break;
        }
        return isValidIntegerValue;
    }

    /*
    task 1.5.6
    */
    private static void flipNumber() {

        Scanner console = new Scanner(System.in);

        boolean isValidValue = false;

        int currentIntValue = 0;

        while (isValidValue == false) {

            System.out.println("Enter a number consisting of 2 digits or more and not having '0' at the end");

            try {
                currentIntValue = Integer.parseInt(console.nextLine());
                isValidValue = checkIsValidNumber(currentIntValue);
            } catch (Exception error) {
                System.out.println(error);
                System.out.println("You've entered NOT a number");
            }
        }

        while (currentIntValue > 0) {
            System.out.print(currentIntValue % 10);
            currentIntValue /= 10;
        }
    }

    private static boolean checkIsValidNumber(int intValue) {

        boolean isValidNumber = false;

        if (intValue % 10 == 0) {
            System.out.println("Number contains '0' at the end");
        }
        else if (intValue < 10) {
            System.out.println("You've entered a number consisting NOT '2' digits");
        } else {
            isValidNumber = true;
        }
        return isValidNumber;
    }
}
