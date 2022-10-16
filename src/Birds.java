import java.util.Objects;

public class Birds extends Animals {

    private NoFlying noFlying;
    private Flying flying;
    private String typeOfMovement;

    public Birds(String livingEnvironment, String nameAnimal, Integer age, String typeOfMovement) {
        super(nameAnimal, age, livingEnvironment);
        if (typeOfMovement != null || !typeOfMovement.isEmpty()) {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public NoFlying getNoFlying() {
        return noFlying;
    }

    public Flying getFlying() {
        return flying;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public Birds(String livingEnvironment) {
        super(livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " ест овес");
    }

    @Override
    public void sleep() {
        System.out.println(getNameAnimal() + " может спать сидя и стоя");
    }

    @Override
    public void moveAround() {
    }

    @Override
    public String toString() {
        return super.toString()+ " " + typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(noFlying, birds.noFlying) && Objects.equals(flying, birds.flying) && Objects.equals(typeOfMovement, birds.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), noFlying, flying, typeOfMovement);
    }
}
