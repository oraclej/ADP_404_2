public class Two {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        numbers[0] = 10;
        numbers[1] = 20;

        int[] numbers2 = {10,20,30,40,50};


        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 2*i;
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int e : numbers)
            System.out.println(e);
    }
}
