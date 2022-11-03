package com.company.figures;

import com.company.Figure;

public class Rectangle extends Figure {
    private double a,b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double length() {
        return (a + b) * 2;
    }

    public double area() {
        return a * b;
    }
}
