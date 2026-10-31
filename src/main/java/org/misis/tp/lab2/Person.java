package org.misis.tp.lab2;

public class Person {

    private final String name;
    private Pet pet;

    public Person(String name) {
        this(name, null);
    }

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void getPetInfo() {
        System.out.println("--------------------");
        if (pet == null) {
            System.out.printf("%s has no pet yet%n", name);
            System.out.println("--------------------");
            return;
        }

        System.out.printf("Pet for %s is named %s%n", name, pet.getName());
        System.out.printf(
                "Age: %d year(s), about %d human years%n",
                pet.getAge(),
                pet.getAgeInHumanYears()
        );
        System.out.println("And it expresses itself like this:");
        pet.express();
        System.out.println("--------------------");
    }
}
