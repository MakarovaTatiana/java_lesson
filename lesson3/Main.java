package lesson3;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Oranges oranges1 = new Oranges();
        Oranges oranges2 = new Oranges();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Oranges> box2 = new Box<Oranges>(oranges1, oranges2);

        System.out.println(box1.compare(box2));

        Box<Oranges> box3 = new Box<Oranges>();
        box2.transfer(box3);
    }
    }

