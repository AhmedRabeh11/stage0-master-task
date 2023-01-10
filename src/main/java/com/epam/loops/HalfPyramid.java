package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int i, j;


        for(i=0; i<cathetusLength; i++)
        {


            for(j=2*(cathetusLength-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }


            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print(" *");
            }

            // ending line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
