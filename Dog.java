package com.animal;

public class Dog extends Animal {

    public Dog(String name, String type) {
        super(name, type);
    }
    public void swim() {
            System.out.println("Максимальная длина заплыва собаки - 10 метров");
        }
    public void run() {
            System.out.println("Максимальная длина забега собаки - 500 метров");
        }
    public boolean running(int runDist) {
        if (runDist > 500) {
            System.out.println("Собака бегает только на 500 метров");
            return false;
        }
        System.out.println(getType() + " " + getName() + " " + "пробежал(а) " + runDist + " м.");
        return true;
    }
    public boolean swimming(int swimDist) {
        if (swimDist > 10) {
            System.out.println("Собака плавает только на 10 метров");
            return false;
        }
        System.out.println(getType() + " " + getName() + " " + "проплыл(а) " + swimDist + " м.");
        return true;
    }
}
