package lesson1;

import com.project.firstproject.Competitors;

public class MainComp {
    public static void main(String[] args) {

        Competitors[] groupOne = new Competitors[4];
        groupOne[0] = new Competitors("Барсик", 3);
        groupOne[1] = new Competitors("Еша", 2);
        groupOne[2] = new Competitors("Лучик", 1);
        groupOne[3] = new Competitors("Кабачок", 4);

        Team teamOne = new Team(groupOne, "Котики");

        Course race = new Course();
        race.doit(teamOne);
    }
}