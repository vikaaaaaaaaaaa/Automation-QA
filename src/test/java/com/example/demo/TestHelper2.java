package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestHelper2 {
    @Test
    public void shortFind() {
        assertEquals(3, Helper.findShort("hey world"));
    }

    @Test
    public void testStraySuccess1() {
        int[] arr = {1, 3, 1, 2, 2};
        int actual = Helper.stray(arr);
        assertEquals(3, actual);
    }

    @Test
    public void testStraySuccess2() {
        int[] arr1 = {9, 9, 9, 9, 9, 5, 5, 66};
        int actual2 = Helper.stray(arr1);
        assertEquals(66, actual2);
    }

    @Test
    public void testStrayFail() {
        int[] arr2 = {9, 9, 9, 7};
        int actual3 = Helper.stray(arr2);
        assertNotEquals(9, actual3);
    }
}
