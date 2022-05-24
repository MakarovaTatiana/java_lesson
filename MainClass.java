package lesson4;

import java.util.*;

public class MainClass {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Алиса", "София", "Анна", "Ольга", "Евгения",
                "Мария", "Кира", "Светлана", "Игорь", "Елена",
                "Сергей", "Анна", "Полина", "Марина", "Кира",
                "Антон", "Денис", "Никита", "Игорь", "Антон"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
