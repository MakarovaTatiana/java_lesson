package lesson1;

import com.project.firstproject.Competitors;

public class Team {
    private String teamName = "Котики";
    Competitors[] team;

    public Team(Competitors[] team, String teamName) {
        this.teamName = teamName;
        this.team = team;
    }

    public Competitors[] getTeam() {
        return team;
    }

    public void setTeam(Competitors[] team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
