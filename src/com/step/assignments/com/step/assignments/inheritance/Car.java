package com.step.assignments.com.step.assignments.inheritance;

public class Car extends Vehicle {
    private int gear;
    private String company;

    public Car(int speed, int wheels, int gear, String company) {
        super(speed, wheels);
        this.gear = gear;
        this.company = company;
    }

    public void changeGear(int gearNo){
        this.gear = gearNo;
    }

    public void drive(){
        System.out.println("Driving .......");
    }
}
