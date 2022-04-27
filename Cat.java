package com.lesson7;

public class Cat {
    private int appetite;
    private String name;
    boolean full;

    public Cat (String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void setAppetite (int appetite) {
        this.appetite = appetite;
    }
    public int getAppetite() {
        return appetite;
    }
    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }
}
