package com.epam.langSyntax;

public class DigitsSumCalculator {
    int sum = 0;
    public void calculateSum(int number) {
        while(number !=0){
            sum += (number%10);
            number /= 10;
        }
    }

}
