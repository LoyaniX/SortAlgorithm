package com.loyanix.sort;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {8, 31, 42, 52, 86, 87, 94, 95, 96, 99, 112, 156, 159, 222};
        System.out.println(search(array, 221));

    }

    public static int search(int[] array, int findValue){

        int arrayStart = 0;
        int arrayEnd = array.length - 1;

        while (arrayStart != arrayEnd){

            int middleOfArray = (arrayStart + arrayEnd) / 2;
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
