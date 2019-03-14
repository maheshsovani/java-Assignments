package com.step.assignments.Exercise1;

public class Main {
    public static void main(String[] args) {
        UnoCard unoCard = new UnoCard("FOUR",4);
        unoCard.duplicate();
        IdentityCard identityCard = new IdentityCard("Mahesh",123);
        identityCard.duplicate();
        unoCard.printDetails();
        identityCard.printDetails();
    }
}
