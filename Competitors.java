package com.project.firstproject;

public class Competitors {
    String name;
    double speed;

    public Competitors(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void info () {
        System.out.println(name +" "+ speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
