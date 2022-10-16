public class Amphibians extends Animals {

    public Amphibians(String nameAnimal, Integer age, String livingEnvironment) {
        super(nameAnimal, age, livingEnvironment);
    }


    @Override
    public void eat() {
        if (getNameAnimal() == "Лягушка") {
            System.out.println(getNameAnimal() + " может есть червей, муравьев, жуков ");
        } else if (getNameAnimal() == "Уж пресноводный") {
            System.out.println(getNameAnimal() + " может есть лягушек, мышей");
        }
    }

    @Override
    public void sleep() {
        System.out.println(getNameAnimal() + " обитает " + getLivingEnvironment());
    }

    @Override
    public void moveAround() {
        if (getNameAnimal() == "Лягушка") {
            System.out.println(getNameAnimal() + " прыгает");
        } else if (getNameAnimal() == "Уж пресноводный") {
            System.out.println(getNameAnimal() + " ползает");
        }
    }

    public boolean equals(Object o) {
        super.equals(o);
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
