public class Main {
    public static void main(String[] args) {
        Car pride = new Car("Pride 141", "white", 1300);
        pride.setColor("RED");
        pride.getEngine().setVolume(1400);

        System.out.println(pride.getWheels()[0].getSize());

        //pride.setName("Pride 141");

        //Engine engine = new Engine();
        //pride.setEngine(engine);

        //pride.setEngine(new Engine());
        //pride.getEngine().setVolume(1300);
    }
}
