public class Main {



    public static void main(String[] args) {
        Point p = new Point(0, 1);
        p.setY(p.getY() + 2);
        System.out.println(p.getX());
        Point e = new Point(2,2);
        e.setX(e.getX() + 3);
        e.setY(e.getY() + 3);
    }
}
