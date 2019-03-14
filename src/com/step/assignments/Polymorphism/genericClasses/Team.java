package com.step.assignments.Polymorphism.genericClasses;

public abstract class Team<T extends Team> {

    private String name;
    private int matchesWon;
    private int matchesLost;
    private int matchesDraw;

    public Team(String name, int matchesWon, int matchesLost, int matchesDraw) {
        this.name = name;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDraw = matchesDraw;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public String getName() {
        return name;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public int getMatchesDraw() {
        return matchesDraw;
    }

    public int compareWithOtherTeam(T team) {
        return this.totalPoints() - team.totalPoints();
    }

    public abstract int totalPoints();

}
