package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {

            for (int j = 0; j < cathetusLength - i - 1; j++) {
                System.out.print("  ");
            }

            int number = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number -= 1;
            }

            for (int j = 2; j <= i+1; j++) {
                System.out.print(j + " ");
            }



            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
