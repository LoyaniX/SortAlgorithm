package com.loyanix.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSelectedSort {

    @Test
    public void testSorting() {

        int[] array = new int[10];
        int[] arrayBase = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
            arrayBase[i] = array[i];
        }

        SelectedSort.sort(array);
        Arrays.sort(arrayBase);

        assert Arrays.equals(array, arrayBase);
    }

    @Test
    public void testSortingOfNullArray(){

        assert SelectedSort.sort(null).equals("Input array is null");
    }

    @Test
    public void testSortingOfEmptyArray(){

        assert SelectedSort.sort(new int[0]).equals("Input array is null");
    }
}