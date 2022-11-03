package com.company.figures;

import com.company.Figure;

public class Circle extends Figure {

    private double radius; // Радиус круга
    private double lenght; // Длина круга

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double length() {
        return 2 * Math.PI * radius;
    }
}
