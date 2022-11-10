package com.company.simple;

public class SimpleClasses {
    public static void main(String[] args) {

    Pen pen = new Pen(Colors.Gray);
    System.out.println(pen.getColor());

    Car car = new Car(Colors.Green);
    System.out.println(car.toString());

    Mixer mixer = new Mixer();
    mixer.setValues(3,5);
    System.out.println(mixer.getTemp());
    }
}


