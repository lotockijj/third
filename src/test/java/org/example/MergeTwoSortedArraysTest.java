package org.example;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedArraysTest {

    @Test
    void mergeArrays1() {
        int[] firstArr = {1, 7, 100, 150, 1000};
        int[] secondArr = {2, 5, 8, 110, 1001};

        int[] result = MergeTwoSortedArrays.mergeArrays(firstArr, secondArr);

        assertEquals(1, result[0]);
        assertEquals(1001, result[result.length - 1]);
    }

    @Test
    void mergeArrays2() {
        int[] firstArr = {1};
        int[] secondArr = {2, 5, 8, 110, 1001};

        int[] result = MergeTwoSortedArrays.mergeArrays(firstArr, secondArr);

        assertEquals(1, result[0]);
        assertEquals(1001, result[result.length - 1]);
    }

    @Test
    void mergeArrays3() {
        int[] firstArr = {1};
        int[] secondArr = {};

        int[] result = MergeTwoSortedArrays.mergeArrays(firstArr, secondArr);

        assertEquals(1, result[0]);
    }

    @Test
    void findCommonArrays1(){
        int[] firstArr = {1, 110, 3, 8, 4, 6};
        int[] secondArr = {2, 5, 8, 110, 1001};

        Set<Integer> result = MergeTwoSortedArrays.findCommonArrays(firstArr, secondArr);

        assertTrue(result.contains(8));
        assertTrue(result.contains(110));
    }

    @Test
    void findCommonArrays2(){
        int[] firstArr = {1,2};
        int[] secondArr = {2,3};

        Set<Integer> result = MergeTwoSortedArrays.findCommonArrays(firstArr, secondArr);

        assertTrue(result.contains(2));
    }
}