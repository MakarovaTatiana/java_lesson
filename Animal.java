package com.animal;

public class Animal {
    private String name;
    private String type;

    public Animal (String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public boolean running (int running) {
        System.out.println(type + name + "пробежал" + running + " метров");
    return true;
    }
    public boolean swimmig (int swimming) {
        System.out.println(type + name + "проплыл" + swimming + " метров");
    return true;
    }

    public String toString() {
        return "Вид " + type + "; Кличка " + name;
    }

    //public void catSwim () {
        //System.out.println();
    //}


    //public void run () {
        //System.out.println();
    //}
}
