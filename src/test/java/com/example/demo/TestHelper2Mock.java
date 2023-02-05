package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;

public class TestHelper2Mock {

    private MockedStatic<Helper> mockStatic;

    @BeforeEach
    public void beforeEach() {
        mockStatic = Mockito.mockStatic(Helper.class);
    }

    @AfterEach
    public void afterEach() {
        mockStatic.close();
    }


    @Test
    public void sumNumberSuccess() {
        String[] firstArray = {"3", "2", ",", "1", ")", "4"};
        String numberText = "3214";
        mockStatic.when(() -> Helper.leftNumbers(any())).thenReturn(numberText);
        long answer1 = Helper2.sumNumbers(firstArray);
        assertEquals(answer1, 3214l);
    }

    @Test
    public void sumNumberFail() {
        String[] firstArray = {"3", "2", ",", "1", ")", "4"};
        String numberText = "3214";
        mockStatic.when(() -> Helper.leftNumbers(any())).thenReturn(numberText);
        long answer1 = Helper2.sumNumbers(firstArray);
        assertNotEquals(answer1, 2314l);
    }

    @Test
    public void sumNumberNull() {
        String numberText = "3214";
        mockStatic.when(() -> Helper.leftNumbers(any())).thenReturn(numberText);
        long answer1 = Helper2.sumNumbers(null);
        assertEquals(answer1, 3214l);
    }
}
