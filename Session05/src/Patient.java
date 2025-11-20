public class Patient {
    private String name;
    private int age;
    private double sugar;
    private double minBloodPressure;
    private double maxBloodPressure;
    public static final double SUGAR_THRESHOLD = 100;
    public static final double PRESSURE_THRESHOLD = 100;

    public static void aMethod(){
        System.out.println(SUGAR_THRESHOLD);
        System.out.println(PRESSURE_THRESHOLD);
    }
    public boolean isDiabetic() {
        if(sugar > SUGAR_THRESHOLD)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMinBloodPressure() {
        return minBloodPressure;
    }

    public void setMinBloodPressure(double minBloodPressure) {
        this.minBloodPressure = minBloodPressure;
    }

    public double getMaxBloodPressure() {
        return maxBloodPressure;
    }

    public void setMaxBloodPressure(double maxBloodPressure) {
        this.maxBloodPressure = maxBloodPressure;
    }
}
