package com.company.lab7.Calculator;

public class Calculator {

    public int modulo(int v, int z) {
        int result = v % z;
        return result;
    }

    public float modulo(float z, float v){
        float result=z % v;
        return result;
    }

    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public float sum(float first, float second) {
        return first + second;
    }

    public int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    public double multiply(double x, double y, double z){
        double result=x * y * z;
        return result;
    }

    public int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public float division(float firstNumber, int secondNumber){
        float result = firstNumber / secondNumber;
        return result;
    }


    public int substract(int x, int y) {
        int result = x - y;
        return result;
    }

    public float substract(int x, float y){
        float result = x - y;
        return result;
    }

}