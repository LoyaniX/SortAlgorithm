package com.loyanix.sort;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {8, 31, 42, 52, 86, 87, 94, 95, 96, 99, 112, 156, 159, 222};
        System.out.println(search(array, 31));

    }


    public static int search(int[] array, int findValue){

        if (array == null || array.length == 0){

            System.out.println("Input array is null or empty");
            return 404;
        }

        int arrayStart = 0;
        int arrayEnd = array.length - 1;

        while (arrayStart <= arrayEnd){

            int middleOfArray = arrayStart + (arrayEnd - arrayStart) / 2;
            int middleValue = array[middleOfArray];

            if (findValue > middleValue) {

                arrayStart = ++middleOfArray;
            } else if (findValue < middleValue) {

                arrayEnd = --middleOfArray;
            } else {

                return middleOfArray;
            }
        }
        return 404;
    }

}
