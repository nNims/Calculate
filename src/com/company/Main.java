package com.company;
import java.lang.String;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String inCalc;
        byte err;
        System.out.println("Калькулятор jm program, введите уравнение:");
        Scanner in = new Scanner(System.in);
        inCalc = in.nextLine();
        inCalc = inCalc.replaceAll(" ", "");
        inCalc = inCalc.toUpperCase();
        int line = inCalc.length();
        if (line < 3 || line > 9)
            err = 10;
            else {
                char charCaclc;
                int znakValid = 0;
                int arabValid = 0;
                int romeValid = 0;
                int valid = --line;
                for (int i = 0; i <= line; i++) {
                    charCaclc = inCalc.charAt(i);
                    if (charCaclc == '1' || charCaclc == '2' || charCaclc == '3' || charCaclc == '4' || charCaclc == '5' || charCaclc == '6' || charCaclc == '7' || charCaclc == '8' || charCaclc == '9' || charCaclc == '0')
                        arabValid++;
                    if (charCaclc == '+' || charCaclc == '-' || charCaclc == '/' || charCaclc == '*')
                        znakValid++;
                    if (charCaclc == 'I' || charCaclc == 'V' || charCaclc == 'X')
                        romeValid++;
                    }
                if (inCalc.charAt(0) == '+' || inCalc.charAt(0) == '-' || inCalc.charAt(0) == '/' || inCalc.charAt(0) == '*')
                    znakValid++;
                if (inCalc.charAt(line)== '+' || inCalc.charAt(line) == '-' || inCalc.charAt(line) == '/' || inCalc.charAt(line) == '*')
                    znakValid++;
                if (arabValid == (valid) && znakValid == 1) {
                    err = 100;
                } else
                    if (romeValid == (valid) && znakValid == 1) {
                        err = 110;
                    } else
                        err = 10;
                }


        switch (err) {
            case 10:
                System.out.println("Уравнение введено не корректно :(");
                break;
            case 100:
                System.out.println("Арабский счёт");
                int i = 0;
                StringTokenizer calc = new StringTokenizer(inCalc, "+-*/", true);
                String[] str = new String[3];
                while (calc.hasMoreTokens()) {
                    Scanner scannerToken = new Scanner(calc.nextToken());
                    str[i] = scannerToken.nextLine();
                    i++;
                }
                int result = matAB.matAB(Integer.parseInt(str[0]), Integer.parseInt(str[2]), str[1]);
                System.out.println(result);
                break;
            case 110:
                int j = 0;
                System.out.println("Римский счёт");
                StringTokenizer calcR = new StringTokenizer(inCalc, "+-*/", true);
                String[] strR = new String[3];
                while (calcR.hasMoreTokens()) {
                    Scanner scannerToken = new Scanner(calcR.nextToken());
                    strR[j] = scannerToken.nextLine();
                    j++;
                }
                int argA = convertRA.roman2Decimal(strR[0]);
                int argB = convertRA.roman2Decimal(strR[2]);
                int resAB = matAB.matAB(argA, argB, strR[1]);
                if (resAB <= 0)
                    System.out.println("Рим не признаёт числа меньше 0");
                else
                System.out.println(convertAR.roman(resAB));
                break;
            default:
        }

        }

}




