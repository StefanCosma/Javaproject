package com.company.lab3.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(7, 15));

        System.out.println(calc.reduction(8 ,5 ));
        System.out.println(calc.multiply(8,9));
        System.out.println(calc.division(81,9));

        LogicalOp op = new LogicalOp();
        System.out.println(op.getHigherNumber(7, 4));


        int biggest = op.getHigherNumber(5,3);

        System.out.println("The bigger number is: " + biggest);

        System.out.println("results is:" + calc.sum(7, 15));
        System.out.println("results is:" + calc.reduction(8, 5));
        System.out.println("results is:" + calc.multiply(8, 9));
        System.out.println("results is:" + calc.division(81, 9));


        int mult2 = calc.multiply(6, 7);
        int result = calc.sum(-10, mult2);
        System.out.println(result);
        System.out.println(6 * 7 + -10);
    }


    public static void printMyName() {
        System.out.println("Hello \nStefan");
    }

    public static void printModel() {
        System.out.println("    J   a    v     v  a");
        System.out.println("    J  a a    v   v  a a");
        System.out.println(" J  J aaaaa    V V  aaaaa");
        System.out.println("  JJ a     a    V  a     a");
    }



    public static int avarageNumber (int firstNumber, int secondNumber, int thirdNumber) {
        int result = (firstNumber + secondNumber + thirdNumber) / 3;
        return result;
    }

    public static void printModel2() {
        System.out.println("  +\"\"\"\" +");
        System.out.println(" [|  o   o  |]");
        System.out.println("  |    ^    | ");
        System.out.println("  |  ' _ '  | ");
        System.out.println("  +---------+ ");
    }

    public static double remainder(double a, double b) {
        double result = (a % b);
        return result;
    }

    public static int FahrenheitToCelsius(int Fahrenheit) {
        int celsius = ((Fahrenheit - 32) * 5 / 9);
        return celsius;
    }

    public static double inchToMeters(double inch) {
        double meters = (inch * 0.0254);
        return meters;
    }

    }
