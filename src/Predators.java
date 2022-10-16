public class Predators extends Mammals{

    public Predators(String livingEnvironment, String nameAnimal, Integer age, Double speedMovement, String typeOfFood) {
        super(livingEnvironment, nameAnimal, age, speedMovement, typeOfFood);
    }

    public void hunt() {
        System.out.println("идет охотиться");
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " - " + "хищник, его тип еды - " + getTypeOfFood());
    }

}
