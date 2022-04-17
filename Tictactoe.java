package com.project.firstproject;

import java.util.Random;
import java.util.Scanner;

public class Tictactoe {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static char[][] table;
    public static int size = 3;
    public static int winValue = 3;
    public static final char empty = '.';
    public static final char xMark = 'X';
    public static final char oMark = 'O';

    public static void initTable() {
        table = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = empty;
            }
        }
    }

    public static void printTable() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        initTable();
        printTable();
        while (true) {
            humanTurn();
            printTable();
            if (checkWin(xMark)) {
                System.out.println("Ты победил");
                break;
            }
            if (isTableFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printTable();
            if (checkWin(oMark)) {
                System.out.println("Победил ИИ");
                break;
            }
            if (isTableFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean isTableFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == empty) return false;
            }
        }
        return true;
    }
        public static void humanTurn () {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y));
            table[y][x] = xMark;
        }
        public static boolean isCellValid ( int x, int y){
            if (x < 0 || x >= size || y < 0 || y >= size) return false;
            if (table[y][x] == empty) return true;
            return false;
        }
        public static void aiTurn () {
            int x, y;
            do {
                x = rand.nextInt(size);
                y = rand.nextInt(size);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер сходил в " + (x + 1) + " " + (y + 1));
            table[y][x] = oMark;
        }
    public static boolean checkWin(char empty) {
        for (int i = 0; i < size; i++) {
            if ((table[i][0] == empty && table[i][1] == empty && table[i][2] == empty) ||
                    (table[0][i] == empty && table[1][i] == empty && table[2][i] == empty))
                return true;
            if ((table[0][0] == empty && table[1][1] == empty && table[2][2] == empty) ||
                    (table[2][0] == empty && table[1][1] == empty && table[0][2] == empty))
                return true;
        }
        return false;
    }
}




