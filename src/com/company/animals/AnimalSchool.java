package com.company.animals;

public class AnimalSchool {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.run();
        Squirrel squirrel = new Squirrel();
        squirrel.run();
    }
}
interface Running{ // Printing, Visible
     void run();
}

interface Swimming{ // Interface vs Abstract class
     void swim();
}

interface Climbing{ // Interface vs Abstract class
     void climb();
}
class Rabbit implements Running, Swimming{

    @Override
    public void run() {
        System.out.println("rabbit runs");
    }

    @Override
    public void swim() {
        System.out.println("rabbit swims");
    }
}

class Squirrel implements Running, Climbing{
    @Override
    public void run() {
        System.out.println("squirrel runs");
    }

    @Override
    public void climb() {
        System.out.println("squirrel climbs");
    }
}