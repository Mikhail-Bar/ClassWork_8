package com.company.simple;

public class Car {
    private Colors color;

    public Car(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Car { color = %s }", color);
    }
}
