package com.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int amount) {
        food -= amount;
    }
    public void increaseFood(int amount2) {
        food += amount2;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }

    public void info0 (){
        System.out.println("Было " + food + " кг еды");
    }
    public void info (){
        System.out.println("Еды осталось " + food + " кг");
    }


}
