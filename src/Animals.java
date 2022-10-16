import java.util.Objects;

public abstract class Animals {
    private String nameAnimal;
    private Integer age;
    private String livingEnvironment;

    public Animals(String nameAnimal, Integer age, String livingEnvironment) {

        if (nameAnimal == null || nameAnimal.isEmpty()) {
            this. nameAnimal = "Впишите имя животного";
        } else {
            this.nameAnimal = nameAnimal;
        }

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Некорректно указан возраст");
        }

        if (livingEnvironment != null || !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        }

    }

    public Animals(String livingEnvironment) {
        if (livingEnvironment != null || !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void moveAround();

    public String getNameAnimal() {
        return nameAnimal;
    }

    public Integer getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return "Имя " + nameAnimal + " возраст " + age + " среда проживания " + livingEnvironment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimal, age, livingEnvironment);
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(nameAnimal, animals.nameAnimal) && Objects.equals(age, animals.age) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }
}
