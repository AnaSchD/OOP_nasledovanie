import java.util.Objects;

public class Mammals extends Animals {

    private Double speedMovement;

    private Herbivores herbivores;

    private Predators predators;

    private String typeOfFood;


    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
        System.out.println(getNameAnimal() + " - " + " обитает в "  + getLivingEnvironment());
    }

    @Override
    public void moveAround() {
        System.out.println(getNameAnimal() + " двигается со скоростью " + getSpeedMovement() + " км/ч.");
    }


    public static class Herbivores extends Mammals {

        public Herbivores(String livingEnvironment, String nameAnimal, Integer age, Double speedMovement, String typeOfFood) {
            super(livingEnvironment, nameAnimal, age, speedMovement, typeOfFood);
        }

        @Override
        public void eat() {
            System.out.println(getNameAnimal() + " - " + "травоядное животное, его тип еды - " + getTypeOfFood());
        }
    }

    public static class Predators extends Mammals {

        public Predators(String livingEnvironment, String nameAnimal, Integer age, Double speedMovement, String typeOfFood) {
            super(livingEnvironment, nameAnimal, age, speedMovement, typeOfFood);
        }

        public static void hunt() {
            System.out.println("идет охотиться");
        }

        @Override
        public void eat() {
            System.out.println(getNameAnimal() + " - " + "хищник, его тип еды - " + getTypeOfFood());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + speedMovement + " " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(speedMovement, mammals.speedMovement) && Objects.equals(herbivores, mammals.herbivores)
                && Objects.equals(predators, mammals.predators) && Objects.equals(typeOfFood, mammals.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedMovement, herbivores, predators, typeOfFood);
    }

    public Mammals(String livingEnvironment, String nameAnimal, Integer age, Double speedMovement, String typeOfFood) {
        super(nameAnimal, age, livingEnvironment);
        if (speedMovement != null) {
            this.speedMovement = speedMovement;
        }
        if (typeOfFood != null || !typeOfFood.isEmpty()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public Herbivores getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(Herbivores herbivores) {
        this.herbivores = herbivores;
    }

    public Predators getPredators() {
        return predators;
    }

    public void setPredators(Predators predators) {
        this.predators = predators;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public Double getSpeedMovement() {
        return speedMovement;
    }

    public void setSpeedMovement(Double speedMovement) {
        this.speedMovement = speedMovement;
    }
}
