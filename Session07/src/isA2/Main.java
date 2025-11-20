package isA2;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Worm worm = new Worm();
        eagle.move();
        worm.move();

        Animal animal = new Eagle();
        Eagle eagle1 = new Eagle();
        eagle1.hunt();
        //animal.hunt();
    }
}
