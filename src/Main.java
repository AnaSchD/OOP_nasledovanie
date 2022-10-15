public class Main {
    public static void main(String[] args) {


        Mammals.Herbivores gazelle = new Mammals.Herbivores("Африка", "Газель", 3, 3.5, "трава");
        Mammals.Herbivores giraffe = new Mammals.Herbivores("Африка", "Жираф", 3, 3.5, "трава");
        Mammals.Herbivores horse = new Mammals.Herbivores("Россия", "Лошадь", 3, 3.5, "трава");

        Mammals.Predators hyena = new Mammals.Predators("Юго-западная Азии", "Гиена", 3, 2.2, "мясо");
        Mammals.Predators tiger = new Mammals.Predators("тайга", "Тигр", 5, 2.2, "мясо");
        Mammals.Predators bear = new Mammals.Predators("лес", "Медведь", 6, 2.2, "мясо");

        System.out.println(gazelle.equals(giraffe));


        Amphibians frog = new Amphibians("Лягушка", 4, "на земле и в воде");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 3, "на земле и в воде");

        System.out.println(frog.equals(alreadyFreshwater));


        Birds.NoFlying peacock = new Birds.NoFlying("", "Павлин", 4, "на ногах");
        Birds.NoFlying penguin = new Birds.NoFlying("", "Пингвин", 2, "переваливаясь с боку на бок");
        Birds.NoFlying birdDodo = new Birds.NoFlying("", "ДоДо", 1, "на ногах");


        Birds.Flying seagull = new Birds.Flying("в небе и на земле", "Чайка", 12, "летает");
        Birds.Flying albatross = new Birds.Flying("в небе и на земле", "Альбатрос", 11, "летает");
        Birds.Flying falcon = new Birds.Flying("в небе и на земле", "Сокол", 3, "летает");



    }
}