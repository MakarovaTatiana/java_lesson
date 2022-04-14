package com.project.nfirstproject;


import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Integer.parseInt("0")) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

        int[] arrOneHundred = new int[100];
        for (int a = 0; a < arrOneHundred.length; a++) {
            arrOneHundred[a] = a;
            System.out.println("arr [" + a + "] = " + arrOneHundred[a]);
        }

        int[] arrRandom = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int r = 0; r < arrRandom.length; r++) {
            if (arrRandom[r] < 6) {
                System.out.println(arrRandom [r] * 2);
            }
        }

        int counter = 1;
        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[0][0] = counter;
                table[1][1] = counter;
                table[2][2] = counter;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        int[] star2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arrays.sort(star2); //располжила ряд по возрастанию, а как взять первое и последнее значение не знаю(((
        {
            System.out.println(Arrays.toString(star2));

        }
        int len = 3;
        int initialValue = 5;
        fiveTask(len, initialValue);
        System.out.println(Arrays.toString(fiveTask(len, initialValue)));
    }

    private static int[] fiveTask(int len, int initialValue) {
        int[] fiveTask = new int[len];
        Arrays.fill(fiveTask, initialValue);
        return fiveTask;
    }
}










