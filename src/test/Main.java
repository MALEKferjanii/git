package test;

import entite.*;

public class Main {
    public static void main(String[] args) {
        // Creating a Zoo
        Zoo myZoo = new Zoo("Central Park Zoo", "New York");

        // Adding aquatic animals to the zoo
        Aquatic dolphin = new Dolphin("Delphinidae", "Dolphin", 10, true, "Ocean", 25.5f);
        Aquatic penguin = new Penguin("Spheniscidae", "Penguin", 5, true, "Antarctica", 50.0f);
        Aquatic dolphin1 = new Dolphin("Delphinidae", "Dolphin", 10, true, "Ocean", 25.5f);
        Aquatic dolphin2 = new Dolphin("Delphinidae", "Dolphin", 10, true, "Ocean", 25.5f);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        // Displaying swim() method of all aquatic animals in the zoo
        myZoo.swimAllAquaticAnimals();

        // Displaying max penguin swimming depth
        System.out.println("Max Penguin Swimming Depth: " + myZoo.maxPenguinSwimmingDepth());

        // Displaying number of aquatic animals by type
        myZoo.displayNumberOfAquaticsByType();
        if (dolphin1.equals(dolphin2)) {
            System.out.println("The two dolphins are equal.");
        } else {*

            System.out.println("The two dolphins are not equal.");
        }
    }
}

