package lesson8;

import java.util.List;

public class Student {
    private String surname;
    private List<Course> courses;

    public Student(String surname, List<Course> courses) {
        this.surname = surname;
        this.courses = courses;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Студент " +
                surname +
                " курса " + courses ;
    }
}
