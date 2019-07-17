package company.lab7.Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {


    public int getInt() {

        boolean repeat;
        int x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    public float getFloat() {
        boolean repeat = false;
        float y = 0.9f;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a float type number: ");
                y = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.err.println("Not a float type number, try again!");
            }
        } while (repeat);
        return y;
    }

    public double getDouble() {
        boolean repeat = false;
        double z = 1.3;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a double type number: ");
                z = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.err.println("Not a double type number, try again!");
            }
        } while (repeat);
        return z;
    }

    public byte getByte() {
        boolean repeat = false;
        byte b = 4;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a byte type number: ");
                b = scan.nextByte();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.err.println("Not a byte type number, try again!");
            }
        } while (repeat);
        return b;
    }

    public List<Integer> intList() {
        List<Integer> myIntList = new ArrayList<>();
        System.out.println("Enter integer numbers to make a list:");
        boolean repeat = true;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
                myIntList.add(x);
                repeat = true;
            } catch (InputMismatchException error) {
                repeat = false;
                System.err.println("Not a number, the list is finished!");
            }
        }
        while (repeat);
        return myIntList;
    }
}

