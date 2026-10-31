package org.misis.tp.lab2;

public class Turtle extends Animal {

    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public int getAgeInHumanYears() {
        if (getAge() <= 0) {
            return 0;
        }
        return 15 + (getAge() - 1) * 2;
    }

    @Override
    public void express() {
        System.out.println("""
                  _____     ____
                 /      \\  |  o |
                |        |/ ___\\|
                |_________/
                |_|_| |_|_|
                """);
    }
}