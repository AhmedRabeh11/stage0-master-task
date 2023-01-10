package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        if(power == 0)
            numberToPrint = 1;

        else if(power>0){
            for(; power > 1; power-- ){
                numberToPrint *=numberToPrint;
        }
            }
        System.out.print(numberToPrint);

        }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
