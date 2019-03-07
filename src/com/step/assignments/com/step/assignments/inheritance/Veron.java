package com.step.assignments.com.step.assignments.inheritance;

public class Veron extends Car {
    private String model;
    private  String  color;
    private String EngineType;

    public Veron(int speed, int wheels, int gear, String company, String model, String color, String engineType) {
        super(speed, wheels, gear, company);
        this.model = model;
        this.color = color;
        EngineType = engineType;
    }
}
