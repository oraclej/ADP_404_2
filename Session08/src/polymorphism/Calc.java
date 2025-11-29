package polymorphism;

public class Calc {
    public static double add(double a, double b){
        return a+b;
    }

    public static double add(double a, double b, double c){
        return a+b+c;
    }

    public static double add(int a, int b){
        return a+b;
    }

    public static double add(int a, double b){
return  a+b;
    }

    public static double add(double a, int b){
return  a+b;
    }

    public static void main(String[] args) {
        add(2,3);
        add(2,3,4);
    }
}
