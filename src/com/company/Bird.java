package com.company;

public class Bird extends Animal{
    private String color;
    private boolean canFly;

    public Bird(String name, int age, boolean isDead) {
        super(name, age, isDead);
    }

    public void fly(){
        System.out.println("I'm fly");
    }

    public final void fly(boolean canFly){
        if (!canFly){
            System.out.println("I'm not can fly");
        }else {
            System.out.println("I'm fly");
        }
    }

    public void chirik(){
        System.out.println("Chirik-chirik!");
    }

    public void chirik(boolean isGoose){
        if (isGoose){
            System.out.println("Ga-ga-ga");
        }
    }
    public String getColor() {
        return color;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}
