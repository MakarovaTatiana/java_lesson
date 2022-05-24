package lesson4;

public class Main {public static void main(String[] args){
    Phonebook phonebook = new Phonebook();

    phonebook.add("Иванов", "89859879787");
    phonebook.add("Иванов", "89012454564");
    phonebook.add("Петров", "89774441122");
    phonebook.add("Сидоров", "83452436088");
    phonebook.add("Иванов", "89058207040");

    System.out.println("Иванов");
    System.out.println(phonebook.get("Иванов"));
    System.out.println("Петров");
    System.out.println(phonebook.get("Петров"));
    System.out.println("Сидоров");
    System.out.println(phonebook.get("Сидоров"));
    System.out.println("-----------------");

    }
}

