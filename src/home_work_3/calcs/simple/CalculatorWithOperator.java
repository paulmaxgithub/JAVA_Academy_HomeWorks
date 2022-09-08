package home_work_3.calcs.simple;

import home_work_3.runners.WithoutCalculatorMain;

public class CalculatorWithOperator {

    //addition
    public double add(double a, double b) { return a + b; }

    //subtraction
    public double subtract(double a, double b) { return a - b; }

    //multiplication
    public double multiply(double a, double b) { return a * b; }

    //division
    public double divide(double a, double b) { return a / b; }

    //exponentiation
    public double exponentiate(double number, int exp) { return (int)number ^ exp; }

    //taking the square root
    public double squareRoot(double ofNumber) {

        double result = ofNumber / 2;
        while (true) {
            result = 0.5 * (result + (ofNumber / result));
            if (result * result >= ofNumber - 0.0000001
                    && result * result <= ofNumber + 0.0000001) {
                break;
            }
        }
        //round value
        result = WithoutCalculatorMain.round(result, 4);
        return result;
    }

    //Module Of Number
    public double getNumberModule(double dividendNum, double divisorNum) {
        double modulusNum = dividendNum % divisorNum;
        modulusNum = WithoutCalculatorMain.round(modulusNum, 1);
        return modulusNum;
    }
}