package entite;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic aquatic = (Aquatic) obj;
        return getName().equals(aquatic.getName()) &&
                getAge() == aquatic.getAge() &&
                habitat.equals(aquatic.getHabitat());
    }
}
