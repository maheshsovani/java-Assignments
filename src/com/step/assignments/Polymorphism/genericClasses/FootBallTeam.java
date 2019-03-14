package com.step.assignments.Polymorphism.genericClasses;

public class FootBallTeam extends Team {

    public FootBallTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
        super(name, matchesWon, matchesLost, matchesDraw);
    }

    public int totalPoints() {
        return super.getMatchesDraw() * 0 + super.getMatchesWon() * 2;
    }

}
