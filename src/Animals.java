public class Animals {

    private String nameAnimal;
    private Integer age;
    private String livingEnvironment;

    public Animals(String nameAnimal, Integer age, String livingEnvironment) {

        if (nameAnimal != null || !nameAnimal.isEmpty()) {
            this.nameAnimal = nameAnimal;
        } else {
            System.out.println("Некорректное имя");
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
        if (livingEnvironment != null || !!livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

        public void eat () {

        }

        public void sleep () {

        }

        public void moveAround () {

        }

        public String getNameAnimal () {
            return nameAnimal;
        }

        public Integer getAge () {
            return age;
        }


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
}
