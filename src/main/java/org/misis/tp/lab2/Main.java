package org.misis.tp.lab2;

public class Main {

    public static void main(String[] args) {
        Parrot kesha = new Parrot("Kesha", 2);
        Turtle zavala = new Turtle("Zavala", 4);
        kesha.happyBirthday();

        Person jack = new Person("Jack", kesha);
        Person john = new Person("John");

        jack.getPetInfo();
        john.getPetInfo();

        john.setPet(zavala);
        john.getPetInfo();
    }
}