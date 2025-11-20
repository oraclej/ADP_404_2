public class Three {
    public static void main(String[] args) {
        int[] numbers = {4,7,2,9,1};
        int sum = 0;
        for(int e : numbers) {
            sum += e;
            System.out.println("SUM=" + sum);
        }
        double avg = (double) sum / numbers.length;
        System.out.println("AVG=" + avg);
    }
}
