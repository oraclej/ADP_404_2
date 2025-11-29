package casting;

public class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("Eagles can fly");
    }

    public void hunt(){
        System.out.println("Eagles can hunt");
    }
}
