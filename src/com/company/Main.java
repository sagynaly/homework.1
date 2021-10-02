package com.company;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird("Кеша", 2, false);
        Pigeon pigeon1 = new Pigeon("Fred", 1, false);
        Pigeon pigeon2 = new Pigeon("Jeff", 2 , true);
        System.out.println(bird.toString() + pigeon1.toString() + pigeon2.toString());
        pigeon1.fly();
        pigeon2.fly();
    }
}
