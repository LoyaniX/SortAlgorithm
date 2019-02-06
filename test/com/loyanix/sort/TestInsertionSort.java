package com.loyanix.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestInsertionSort {
    @Test
    public void testSorting(){

        int[] array = new int[10];
        int[] arrayBase = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
            arrayBase[i] = array[i];
        }

        InsertionSort.sort(array);
        Arrays.sort(arrayBase);

        assert Arrays.equals(array, arrayBase);

    }
}
