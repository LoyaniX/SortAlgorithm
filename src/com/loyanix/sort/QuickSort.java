package com.loyanix.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
        }

        System.out.println("Default array " + Arrays.toString(array));
        sort(array, 0, array.length);
        System.out.println("Sorted array " + Arrays.toString(array));
    }

    public static void sort(int[] array, int startPossition,int endPossition){

        int i = startPossition;
        int j = endPossition - 1;
        int middle = array[(i + j) / 2];

        while (i <= j){

            while (array[i] < middle) {
                i++;
            }
            while (array[j] > middle){
                j--;
            }

            if (i <= j){
                int buffer = array[i];
                array[i] = array[j];
                array[j] = buffer;
                i++;
                j--;
            }
        }

        if(startPossition < j) sort(array, startPossition, j);
        if(endPossition > i) sort(array, i, endPossition);

    }
}
