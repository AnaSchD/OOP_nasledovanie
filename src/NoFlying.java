public class NoFlying extends Birds{

    public NoFlying(String livingEnvironment, String nameAnimal, Integer age, String typeOfMovement) {
        super(livingEnvironment, nameAnimal, age, typeOfMovement);
    }

    @Override
    public void moveAround() {
        System.out.println(getNameAnimal() + " - нелетающая птица, она передвигается на " + getFlying());
    }

    public void Walk() {
        System.out.println("идет гулять");
    }
}
