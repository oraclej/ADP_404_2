package isA;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.hunt();
        eagle.eat();

        Bird bird = new Bird();
        bird.eat();
    }
}
