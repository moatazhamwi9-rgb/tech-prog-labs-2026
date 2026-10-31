package org.misis.tp.lab2;

public class Parrot extends Animal {

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public int getAgeInHumanYears() {
        return getAge() * 5;
    }

    @Override
    public void express() {
        System.out.println(getName() + ": \"Hello!\"");
        System.out.println("""
                     \\
                     (o>
                  \\\\_//)
                   \\_/_)
                    _|_
                    """);
    }
}