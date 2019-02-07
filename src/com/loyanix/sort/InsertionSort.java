package com.loyanix.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
        }

        sort(array);
    }

    public static String sort(int[] array){

        if (array == null || array.length == 0){

            return "Input array is null";
        }
        System.out.println("Default array " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }

        return "Sorted array " + Arrays.toString(array);
    }
}
