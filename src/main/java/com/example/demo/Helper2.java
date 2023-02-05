package com.example.demo;

import java.util.HashMap;
import java.util.Arrays;

public class Helper2 {

    public static int findShort(String s) {
        String[] short1 = s.split(" ");
        int a = short1[0].length();

        for (int i = 1; i < short1.length; i++) {
            if (short1[i].length() < a) {
                a = short1[i].length();
            }
        }
        return a;
    }

    public static HashMap<Integer, Integer> getFrequentMap(int[] collection) {
        HashMap<Integer, Integer> cat = new HashMap<>();
        for (int i = 0; i < collection.length; i++) {
            if (cat.containsKey(collection[i])) {
                cat.put(collection[i], cat.get(collection[i]) + 1);
            } else {
                cat.put(collection[i], 1);
            }
        }
        return cat;
    }

    public static int[] removeEvenNumbers(int[] arr) {
        int[] oddNumbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                oddNumbers[i] = arr[i];
            }
        }
        return oddNumbers;
    }


    public static long sumNumbers(String[] array) {
        String text = Arrays.toString(array);
        String numbers = Helper.leftNumbers(text);
        return Long.parseLong(numbers);
    }
}
