package com.company.lab7.Calculator;

public class Main {
    public static void main(String[] args) {
        company.lab7.Calculator.Read read = new company.lab7.Calculator.Read();
        System.out.println("Please enter a number: " + read.getInt());
        System.out.println("Please enter a number: " + read.getFloat());
        System.out.println("Please enter a number: " + read.getDouble());
        System.out.println("Please enter a number: " + read.getByte());
        System.out.println(read.intList());


    }
}

