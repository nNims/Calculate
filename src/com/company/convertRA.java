package com.company;

public class convertRA {
    private static final String[] numerals = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int roman2Decimal(String roman) {
        int result = 0;
        for (int i = 0; i < numerals.length; i++) {
            while (roman.startsWith(numerals[i])) {
                result += values[i];
                roman = roman.substring(numerals[i].length());
            }
        }
        return result;
    }
}
