public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(int x1){
        x = x1;
        y = 0;
    }

    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(5, 1);

        System.out.println(p1.x + ":" + p1.y);
        System.out.println(p2.x + ":" + p2.y);
    }
}
