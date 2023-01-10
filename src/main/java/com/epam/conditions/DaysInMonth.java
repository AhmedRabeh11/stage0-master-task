package com.epam.conditions;

public class DaysInMonth {
    int numberOfDays = 31;

    public void printDays(int year, int month) {

        if(month > 12 || month == 0){
            System.out.println("invalid date");
        }
        else{
            switch (month) {
                case 2 -> {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 != 0)) {
                        numberOfDays = 29;
                    } else {
                        numberOfDays = 28;
                    }
                }
                case 4 -> numberOfDays = 30;
                case 6 -> numberOfDays = 30;
                case 9 -> numberOfDays = 30;
                case 11 -> numberOfDays = 30;
                default -> {
                }
            }
        }

        }




    }

