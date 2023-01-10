package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        if(length <= 0)
            return new int[]{0};
        else {
        int[] numbersArray = new int[length];
        for(int i = 0; i< length; i++)
            numbersArray[i]= i+1;

        return numbersArray;
        }
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        if(arr == null)
            return sum;
        else
        {
            for (int j : arr) sum += j;

        return sum;
        }
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i< arr.length; i++) {
            if(arr[i] == number)
                return i;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        for (int i = 0; i< arr.length - 1; i++){
            if(i == (arr.length - 1)/2){
                continue;
            }
            String temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int positiveCount = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            }
        }

        // Create a new array to store the positive numbers
        int[] positiveNumbers = new int[positiveCount];

        // Copy the positive numbers from the input array to the new array
        int j = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers[j++] = num;
            }
    }
        return positiveNumbers;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j].length < arr[j-1].length) {
                int[] temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        // Implementing the insertion sort on the elements of the sub arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                int key = arr[i][j];
                int k = j - 1;
                while (k >= 0 && arr[i][k] > key) {
                    arr[i][k + 1] = arr[i][k];
                    k = k - 1;
                }
                arr[i][k + 1] = key;
            }
        }
        return arr;
    }
}
