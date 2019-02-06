package com.loyanix.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
        }

        sort(array);

    }

    public static void sort(int[] array){

        System.out.println("Start array is:" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }

        System.out.println("Sorted array is:" + Arrays.toString(array));
    }
}
