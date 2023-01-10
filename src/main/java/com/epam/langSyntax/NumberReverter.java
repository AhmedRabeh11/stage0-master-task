package com.epam.langSyntax;

public class NumberReverter {
    int reversedNumber = 0;
    public void revert(int number) {
        while(number != 0){
            int digit = number%10;
            reversedNumber = reversedNumber * 10 + digit;
            number/= 10;
        }

    }

}
