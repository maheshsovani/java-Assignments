package com.step.assignments.Polymorphism.genericClasses;

import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Team> {

    private List<T> teams;

    public LeagueTable(List<T> teams) {
        this.teams = teams;
    }

    public void compareTeams() {
        this.teams.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o2.compareWithOtherTeam(o1);
            }
        });
    }

    public void printTeams() {
        this.compareTeams();
        for (T team : this.teams) {
            System.out.println(team.getName());
        }
    }

    public void addTeam(T team) {
        this.teams.add(team);
    }
}
