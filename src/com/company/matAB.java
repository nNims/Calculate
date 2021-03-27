package com.company;

public class matAB {
    public static int matAB(int argA, int argB, String znak) {
        int result = 0;
        if (argA <= 10 && argA >= 1 && argB <= 10 && argB >= 1) {
            if (znak.equals("+")) {
                result = argA + argB;
            }
            if (znak.equals("-")) {
                result = argA - argB;
            }
            if (znak.equals("*")) {
                result = argA * argB;
            }
            if (znak.equals("/")) {
                result = argA / argB;
            }

        } else {
            System.out.println("Я не у умею считат цифры больше 10");
            System.exit(0);
        }
        return (result);
    }
}