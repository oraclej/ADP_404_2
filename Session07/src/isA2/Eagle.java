package isA2;

public class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("I fly");
    }

    public void hunt(){
        System.out.println("I hunt");
    }
}
