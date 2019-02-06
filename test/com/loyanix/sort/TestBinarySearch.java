package com.loyanix.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestBinarySearch {

    private int[] array = new int[20];

    @BeforeEach
    public void init(){

        array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
        }

        Arrays.sort(array);

    }

    @Test
    public void testSearch(){

        int index = (int) (Math.random() * 20);
        int searchIndex = BinarySearch.search(array, array[index]);
        int baseIndex = Arrays.binarySearch(array, array[index]);

        assert searchIndex == baseIndex;
    }

    @Test
    public void testSearchExtremePoint(){

        int[] array = {8, 31, 42, 52, 86, 87, 94, 95, 96, 99, 112, 156, 159, 222};
        int searchFirstIndex = BinarySearch.search(array, 8);
        int searchLastIndex = BinarySearch.search(array, 222);

        assert searchFirstIndex == 0;
        assert searchLastIndex == 13;
    }

    @Test
    public void testSearchNonexistentValue(){

        int[] array = {8, 31, 42, 52, 86, 87, 94, 95, 96, 99, 112, 156, 159, 222};
        int searchIndex = BinarySearch.search(array, 101);

        assert searchIndex == 404;
    }
}
