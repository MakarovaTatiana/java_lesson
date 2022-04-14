package com.reoject.firstproject;

public class lesson2 {
    public static void main(String[] args) {
        boolean10And20 (7, 55);
        positivNegativ (-9);
        booleanTrueFalse (4);
        printString ();
        leapYear (400);
    }

    public static int boolean10And20(int a, int i) {
        int b = a + i;
        boolean x = (b >= 10 && b <= 20);
            System.out.println(x);
        return b;
    }

    private static void positivNegativ(int i) {
        if (i > 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }


    private static void booleanTrueFalse(int i) {
        boolean x = (i > 0);
            System.out.println(x);
    }


    private static void printString() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello world");
        }
    }

    private static void leapYear(int i) {
        boolean u = (i % 400 == 0);
            System.out.println(u);
    }
}







