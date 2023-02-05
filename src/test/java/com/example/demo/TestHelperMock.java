package com.example.demo;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;

public class TestHelperMock {
    private MockedStatic<Helper2> mockStatic;

    @BeforeEach
    public void beforeEach() {
        mockStatic = Mockito.mockStatic(Helper2.class);
    }

    @AfterEach
    public void afterEach() {
        mockStatic.close();
    }


    @Test
    public void mostFrequentItemCountTest() {
        int[] arr1 = {9, 9, 9, 9, 9, 5, 5, 66};
        HashMap<Integer, Integer> cat = new HashMap<>();
        cat.put(5, 2);
        cat.put(9, 5);
        cat.put(66, 1);
        mockStatic.when(() -> Helper2.getFrequentMap(any())).thenReturn(cat);
        int maxValue = Helper.mostFrequentItemCount(arr1);
        assertEquals(5, maxValue);
    }

    @Test
    public void turnNumberSuccess() {
        int[] arr = {2, 5, 4, 0, 48, 1};
        int[] arrOdd = {5, 0, 1};
        mockStatic.when(() -> Helper2.removeEvenNumbers(any())).thenReturn(arrOdd);
        long answer = Helper.turnNumber(arr);
        assertEquals(answer, 501);
    }

    @Test
    public void turnNumberNull() {
        int[] arrOdd = {5, 0, 1};
        mockStatic.when(() -> Helper2.removeEvenNumbers(any())).thenReturn(arrOdd);
        long answer = Helper.turnNumber(null);
        assertEquals(answer, 501);
    }

    @Test
    public void turnNumberFail() {
        int[] arr = {2, 5, 4, 0, 48, 1};
        int[] arrOdd = {5, 0, 1};
        mockStatic.when(() -> Helper2.removeEvenNumbers(any())).thenReturn(arrOdd);
        long answer = Helper.turnNumber(arr);
        assertNotEquals(answer, 105);
    }

}
