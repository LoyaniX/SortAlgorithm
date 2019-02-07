package com.loyanix.sort;

import java.util.Arrays;

public class QuickSort {

    private static int[] poinArray;

    public static void main(String[] args) {

        int[]  array = new int[13];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
        }

        System.out.println("Default array " + Arrays.toString(array));

        sort(array);

        System.out.println("Sorted array " + Arrays.toString(array));
    }

    public static void sort(int[] values) {

        poinArray = values;

        quicksort(0, poinArray.length - 1);
    }

    private static void quicksort(int startArray, int endArray) {

        int i = startArray;
        int j = endArray;
        int pivot = poinArray[startArray + (endArray - startArray) / 2];

        while (i <= j) {

            while (poinArray[i] < pivot){
                i++;
            }
            while (poinArray[j] > pivot){
                j--;
            }
            if (i <= j) {

                int temp = poinArray[i];

                poinArray[i] = poinArray[j];
                poinArray[j] = temp;

                i++;
                j--;
            }
        }

        if (startArray < j){
            quicksort(startArray, j);
        }
        if (i < endArray){
            quicksort(i, endArray);
        }
    }
}
