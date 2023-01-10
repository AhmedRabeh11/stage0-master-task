package com.epam.loops;


public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for(int i = 2; i<=10; i++){
            int valueOfMultiplication = i*numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + valueOfMultiplication + "\n");
        }
    }

}
