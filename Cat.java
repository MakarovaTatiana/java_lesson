package com.animal;

public class Cat extends Animal {

    public Cat(String name, String type) {
        super(name, type);
    }
    public void swim() {
        System.out.println("Кот не умеет плавать");
    }
    public void run() {
        System.out.println("Максимальная длина забега кота - 200 метров");
    }

    public boolean swimming(int swimDist) {
        if (swimDist > 0)
            System.out.println("Ошибка! Коты не умеют плавать");
            return true;
    }
    public boolean running(int runDist) {
        if (runDist > 200) {
            System.out.println("Ошибка! Кот бегает только на 200 метров");
            return false;
        }
        System.out.println(getType() + getName() + "пробежал" + runDist + "м.");
        return true;
    }
}
