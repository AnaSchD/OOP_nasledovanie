public class Birds extends Animals {

    private NoFly noFly;

    private Fly fly;


    public NoFly getNoFly() {
        return noFly;
    }

    public Fly getFly() {
        return fly;
    }

    public Birds(String livingEnvironment) {
        super(livingEnvironment);
    }

    public static void hunt() {
        System.out.println("идет охотиться");
    }

    public class NoFly {

        private String typeOfMovement;

        public NoFly(String typeOfMovement) {
            if (typeOfMovement != null || !typeOfMovement.isEmpty()) {
                this.typeOfMovement = typeOfMovement;
            }
        }
        public static void Walk () {
            System.out.println("идет гулять");
        }
    }

    public class Fly {
        private String typeOfMovement;

        public Fly(String typeOfMovement) {
            if (typeOfMovement != null || !typeOfMovement.isEmpty()) {
                this.typeOfMovement = typeOfMovement;
            }
        }
        public static void fly () {
            System.out.println("идет летать");
        }
    }

}
