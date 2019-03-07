package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(2.15);
        double radius = c.getRadius();
        assertEquals(2.15, radius);
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.15);
        double area = c.getArea();
        assertEquals(14.522012041218817, area);
    }
}