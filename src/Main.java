public class Main {
    public static void main(String[] args) {


        Herbivores gazelle = new Herbivores("Африка", "Газель", 3, 3.5, "трава");
        Herbivores giraffe = new Herbivores("Африка", "Жираф", 3, 3.5, "трава");
        Herbivores horse = new Herbivores("Россия", "Лошадь", 3, 3.5, "трава");

        Predators hyena = new Predators("Юго-западная Азии", "Гиена", 3, 2.2, "мясо");
        Predators tiger = new Predators("тайга", "Тигр", 5, 2.2, "мясо");
        Predators bear = new Predators("лес", "Медведь", 6, 2.2, "мясо");

        System.out.println(gazelle.equals(giraffe));


        Amphibians frog = new Amphibians("Лягушка", 4, "на земле и в воде");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 3, "на земле и в воде");

        System.out.println(frog.equals(alreadyFreshwater));


        NoFlying peacock = new NoFlying("", "Павлин", 4, "на ногах");
        NoFlying penguin = new NoFlying("", "Пингвин", 2, "переваливаясь с боку на бок");
        NoFlying birdDodo = new NoFlying("", "ДоДо", 1, "на ногах");


        Flying seagull = new Flying("в небе и на земле", "Чайка", 12, "летает");
        Flying albatross = new Flying("в небе и на земле", "Альбатрос", 11, "летает");
        Flying falcon = new Flying("в небе и на земле", "Сокол", 3, "летает");


    }
}