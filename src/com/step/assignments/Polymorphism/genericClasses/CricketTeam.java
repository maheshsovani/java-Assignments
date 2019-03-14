package com.step.assignments.Polymorphism.genericClasses;

public class CricketTeam extends Team {

    public CricketTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
        super(name, matchesWon, matchesLost, matchesDraw);
    }

    public int totalPoints() {
        return super.getMatchesDraw() * 0 + super.getMatchesWon() * 2;
    }
}
