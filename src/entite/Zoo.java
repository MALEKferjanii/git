package entite;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final int MAX_CAGES = 25;
    private static final int MAX_AQUATIC_ANIMALS = 10;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int animalCount;
    private int aquaticAnimalCount;

    public Zoo(String name, String city) {
        this.name = (name != null && !name.isEmpty()) ? name : "Unnamed Zoo";
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.aquaticAnimals = new Aquatic[MAX_AQUATIC_ANIMALS];
        this.animalCount = 0;
        this.aquaticAnimalCount = 0;
    }

    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
    }

    public boolean isAquaticAnimalsFull() {
        return aquaticAnimalCount >= MAX_AQUATIC_ANIMALS;
    }

    public void addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[animalCount] = animal;
            animalCount++;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (!isAquaticAnimalsFull()) {
            aquaticAnimals[aquaticAnimalCount] = aquatic;
            aquaticAnimalCount++;
        }
    }

    public void displayAllAquaticSwims() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }

    public void swimAllAquaticAnimals() {
    }
}