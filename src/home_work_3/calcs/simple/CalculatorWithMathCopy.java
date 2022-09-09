package home_work_3.calcs.simple;

import home_work_3.runners.WithoutCalculatorMain;

public class CalculatorWithMathCopy {

    /**
     * Math doesn't contain methods to join numbers in double type.
     * <p>To rich goal and use Math to work with values as double Math has method fma(a,b,c)
     * @param a - first value
     * @param b - second value
     * @return (a × b + c)
     */

    //addition
    public double addDouble(double a, double b) {
        return Math.fma(1, a, b);
    }

    //multiplication
    public double multiplyDouble(double a, double b) {
        return Math.fma(a, b, 0);
    }

    //division (in Math class division of doubles is missing!)
    public double divideDouble(double a, double b) { return a / b; }

    //exponentiation
    public double exponentiate(double number, int exp) {
        return Math.pow(number, exp);
    }

    //taking the square root
    public double squareRoot(double ofNumber) {
        return WithoutCalculatorMain.round(Math.sqrt(ofNumber), 4);
    }

    //Module Of Number (in Math class get module of number is missing!)
    public double getNumberModule(double dividendNum, double divisorNum) {
        double modulusNum = dividendNum % divisorNum;
        modulusNum = WithoutCalculatorMain.round(modulusNum, 4);
        return modulusNum;
    }
}
