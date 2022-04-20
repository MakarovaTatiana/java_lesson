package com.project.firstproject;

public class Person {
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Person (String surname, String name, String patronymic, String position, String email, String phoneNumber, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Фамилия: %s \nИмя: %s\nОтчество: %s\nДолжность: %s\nEmail: %s\nНомер телефона: %s\nЗарплата: %d\nВозраст: %d \n \n",
                surname, name, patronymic, position, email, phoneNumber, salary, age);}

    public void info(){
        System.out.print(this);
    }

public static void main(String[] args) {

        Person[] perArray = new Person[5];
        perArray[0] = new Person("Макаров", "Антон", "Владимирович", "Геолог", "myemail@mail.ru", "89129998877", 100000, 35);
        perArray[1] = new Person("Кузьмина", "Татьяна", "Валентиновна", "Менеджер по персоналу", "ger@mail.ru", "89829115758", 30000, 35);
        perArray[2] = new Person("Петров", "Игорь", "Владимирович", "Инженер", "pochta@google.com", "89051234567", 80000, 44);
        perArray[3] = new Person("Иванова", "Анна", "Леонидовна", "Капитан", "ufsin@mail.ru", "89019876541", 60000, 42);
        perArray[4] = new Person("Киршина", "Марина", "Камиловна", "Кандидат биологических наук", "zerno@yandex.ru", "89124566545", 50000, 26);

        for (int i=0; i < perArray.length; i++)
        if (perArray[i].age > 40) perArray[i].info();
        }
}
