public class Mammals extends Animals {

    private Double speedMovement;

    private Herbivores herbivores;

    private Predators predators;


    public class Herbivores {

        private String typeOfFood;

        public Herbivores(String typeOfFood) {
            if (typeOfFood != null || !typeOfFood.isEmpty()) {
                this.typeOfFood = typeOfFood;
            }
        }
        public static void Graze() {
            System.out.println("идет пастись");
        }

    }

    public class Predators {

        private String typeOfFood;

        public Predators(String typeOfFood) {
            if (typeOfFood != null || !typeOfFood.isEmpty()) {
                this.typeOfFood = typeOfFood;
            }
        }

        public static void hunt () {
            System.out.println("идет охотиться");
        }

    }

    public Mammals(String livingEnvironment, String nameAnimal, Integer age, Double speedMovement) {
        super(nameAnimal, age, livingEnvironment);
        if (speedMovement != null) {
            this.speedMovement = speedMovement;
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

    public static void walk() {
        System.out.println("идёт гулять");
    }

    public Double getSpeedMovement() {
        return speedMovement;
    }

    public void setSpeedMovement(Double speedMovement) {
        this.speedMovement = speedMovement;
    }
}
