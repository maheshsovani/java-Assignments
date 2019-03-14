package com.step.assignments.Polymorphism.genericClasses;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        CricketTeam indXiC = new CricketTeam("IND XI C", 1, 2, 3);
        CricketTeam ausXiC = new CricketTeam("AUS XI C", 2, 2, 0);
        CricketTeam rsaXiC = new CricketTeam("RSA XI C", 1, 1, 1);


        LeagueTable<CricketTeam> cricketTeamLeauge = new LeagueTable<>((asList(indXiC, ausXiC, rsaXiC)));
        cricketTeamLeauge.printTeams();

        System.out.println("***************************");
        FootBallTeam indXiF = new FootBallTeam("IND XI F", 1, 2, 3);
        FootBallTeam ausXiF = new FootBallTeam("AUS XI F", 2, 2, 0);
        FootBallTeam rsaXiF = new FootBallTeam("RSA XI F", 1, 1, 1);


        LeagueTable<FootBallTeam> footbalTeamLeauge = new LeagueTable<>(asList(indXiF, ausXiF, rsaXiF));
        footbalTeamLeauge.printTeams();
    }
}
