public class Flying extends Birds{

    public Flying(String livingEnvironment, String nameAnimal, Integer age, String typeOfMovement) {
        super(livingEnvironment, nameAnimal, age, typeOfMovement);
    }

    @Override
    public void moveAround() {
        System.out.println(getNameAnimal() + " - летающая птица, она " + getFlying());
    }

    public void fly() {
        System.out.println("идет летать");
    }

}
