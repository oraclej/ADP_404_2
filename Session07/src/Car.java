public class Car {
    private String name;
    private String color;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String name, String color, int vol){
        this.name = name;
        this.color = color;
        this.engine = new Engine(vol);
        wheels = new Wheel[4];
        Wheel wheel = new Wheel();
        for (int i = 0; i < 4; i++) {
            wheels[i] = wheel;
        }
        wheels[0].setSize(120);
        wheels[1].setSize(140);
        wheels[2].setSize(160);
        wheels[3].setSize(180);
        //this.engine.setVolume(vol);
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
