package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int numberOfDays = 31;
        if(month > 12 || month == 0){
            System.out.println("invalid date");
        }
        else{
            switch (month) {
                case 2:{
                    if ((year % 4 == 0 && year % 100 != 0) || ((year % 4 == 0 && year % 100 == 0 )&& year % 400 == 0)) {
                        numberOfDays = 29;
                    } else {
                        numberOfDays = 28;
                    }
                    break;
                }
                case 4:
                    numberOfDays = 30;
                    break;
                case 6:
                    numberOfDays = 30;
                    break;
                case 9:
                    numberOfDays = 30;
                    break;
                case 11:
                    numberOfDays = 30;
                    break;
                default:
                    break;
            }
            System.out.println(numberOfDays);
        }
    }




    }

