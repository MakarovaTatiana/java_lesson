package com.animal;

public class Main {

    public static void main (String[] args) {
        Cat cat = new Cat("Ёша", "Кот");
        Dog dog = new Dog ("Бруня", "Собака");

        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println();
        cat.swim();
        dog.swim();
        cat.run();
        dog.run();
        System.out.println("************");
        cat.swimming(5);
        cat.running(400);
        dog.running(420);
        dog.swimming(4);
    }

}
