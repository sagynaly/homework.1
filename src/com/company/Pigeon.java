package com.company;

public class Pigeon extends Bird{
    private colorOfPlumage colorOfPlumage;

    public Pigeon(String name, int age, boolean isDead) {
        super(name, age, isDead);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm fly, but i'm a pigeon");
    }

    public void poo(){
        System.out.println("i'm poo on the car :)");
    }

    public com.company.colorOfPlumage getColorOfPlumage() {
        return colorOfPlumage;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "colorOfPlumage=" + colorOfPlumage +
                '}';
    }
}
