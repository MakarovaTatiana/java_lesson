package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Макаров", Arrays.asList(new Course("Геоинформатика"), new Course("Биология"))));
        students.add(new Student("Петров", Arrays.asList(new Course("География"), new Course("Туризм"), new Course("Английский язык"))));
        students.add(new Student("Киршина", Arrays.asList(new Course("Биология"), new Course("История"), new Course("Биология"))));
        students.add(new Student("Ижевская", Arrays.asList( new Course("Юриспруденция"), new Course("Обществознание"))));
        students.add(new Student("Калинина", Arrays.asList(new Course("Изобразительное искусство"), new Course("Психология"), new Course("Вокал"))));

        System.out.println("Уникальные курсы:");
        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));
        System.out.println("Посещающие большее количество курсов:");
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));
        System.out.println("Студенты курса ");
        Course course = new Course("Химия");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
