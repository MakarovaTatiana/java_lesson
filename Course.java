package lesson1;

import static java.util.Collections.*;

public class Course {
    private int[] course = {100, 100, 100, 100};

    public Object doit(Team team) {
        double result = 0;
        double totalResult = 0;
        for (int i = 0; i < course.length; i++) {
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[i]/team.getTeam()[i].getSpeed();
            }
            System.out.println("Результат " + team.getTeam()[i].getName() + " из команды " + team.getTeamName() + " " + result + " секунд");

        totalResult += result;
        }
        System.out.println("**************");

        System.out.println("Общий результат команды " + team.getTeamName() + " " + totalResult);

        return null;
    }

}
