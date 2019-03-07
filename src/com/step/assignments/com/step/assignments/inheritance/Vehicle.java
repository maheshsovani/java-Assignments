package com.step.assignments.com.step.assignments.inheritance;

public class Vehicle {
    private int speed;
    private int wheels;

    public Vehicle(int speed, int wheels) {
        this.speed = speed;
        this.wheels = wheels;
    }

    public void increaseSpeed(int speed) {
        this.speed += speed;
    }


    public void decreaseSpeed(int speed) {
        this.speed -= speed;
    }

}
