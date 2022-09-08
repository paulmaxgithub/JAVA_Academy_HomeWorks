package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        double result = 4.1 + (15 * 7 + ((28 / 5) ^ 2));

        double x = calculator.divide(28, 5);
        x = calculator.exponentiate(x, 2);
        double y = calculator.multiply(15, 7);
        x = calculator.add(x, y);
        x = calculator.add(x, 4.1);

        //to get value from mathematical expression
        System.out.println(result);

        //to get value using methods using CalculatorWithOperator class
        System.out.println(x);

        //result of square root without of using Math
        System.out.println(calculator.squareRoot(170));

        //get module of number
        System.out.println(calculator.getNumberModule(8.9, 2.7));
    }
}