package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Helper {

    public static long sumNumbers(String[] array){
        String text1 = Arrays.toString(array);
        String numbers =Helper.leftNumbers(text1);
        return Long.parseLong(numbers);
    }

    static int stray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
                if (count == 2) {
                    break;
                }
            }
            if (count == 1) {
                return numbers[i];
            }
        }
        return 0;
    }

    public static int mostFrequentItemCount(int[] collection) {
        HashMap<Integer, Integer> cat = Helper2.getFrequentMap(collection);
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : cat.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();

            }
        }
        return maxValue;
    }


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

    public static long turnNumber(int[] arr) {
        int[] oddArray = Helper2.removeEvenNumbers(arr);
        String str = "";
        for (int i = 0; i < oddArray.length; i++) {
            str += oddArray[i];
        }
        return Long.parseLong(str);

    }

    public static String leftNumbers(String text) {
        return text.replaceAll("[^0-9]", "");
    }
}

