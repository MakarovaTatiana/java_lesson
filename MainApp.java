package com.lesson7;

import java.util.Scanner;

public class MainApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Васька", 25, false);
        allCats[1] = new Cat("Мурка", 15, false);
        allCats[2] = new Cat("Гав", 10, false);

        Plate plate = new Plate(50);
        plate.info0();

        int a;
        for (a = 0; a < allCats.length; a++) {
            if (allCats[a].full == false && allCats[0].getAppetite() < plate.getFood()) {
                allCats[a].eat(plate);
                allCats[a].full = true;
                System.out.println(allCats[a].getName() + " сыт!");
            } else {
                System.out.println(allCats[a].getName() + " голоден!");
            }
        }
        plate.info();

        int addFood;
        System.out.println("Сколько еды добавить?");
        addFood = sc.nextInt();
        plate.increaseFood(addFood);
        plate.info();
    }
}


    //cat1.eat(plate);
        //plate.info();

        //Cat cat2 = new Cat("Мурка", 10, false);
        //cat2.eat(plate);

       // plate.info();

        //int count = plate.getFood()/cat1.getAppetite();
        //int count2 = plate.getFood()/cat2.getAppetite();

        //System.out.println(cat1.getName() + " еще покушает " + count + " раз");

       // System.out.println(cat2.getName() + " еще покушает " + count2 + " раз");


