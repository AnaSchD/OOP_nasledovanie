public class Herbivores extends Mammals {


    public Herbivores(String livingEnvironment, String nameAnimal, Integer age, Double speedMovement, String typeOfFood) {
        super(livingEnvironment, nameAnimal, age, speedMovement, typeOfFood);
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " - " + "травоядное животное, его тип еды - " + getTypeOfFood());
    }

}
