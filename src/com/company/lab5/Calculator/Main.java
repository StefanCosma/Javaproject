package com.company.lab5.Calculator;

public class Main {

        public static void main(String[] args) {

            LogicalOp op = new LogicalOp();
            int[] myArray = op.getArrayToHundred();
            op.getArrayToHundred();

            int[] myArray2 = op.getEvenArray();
            for (int i = 0; i <myArray2.length; i++)
                System.out.println(myArray2[i]);
            op.getEvenArray();


            op.getAverageArray();
            op.checkIfNumberInArray();
            op.printGrille();
            int[] myArray = {1,2,3,4,5,6};




        }
    }

