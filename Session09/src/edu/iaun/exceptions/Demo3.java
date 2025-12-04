package edu.iaun.exceptions;

public class Demo3 {
    public static void main(String[] args) {
        try{
            System.out.println(2/1); // ArithmeticException

            int[] arr = {1,2,3};
            System.out.println(arr[0]); //ArrayIndexOutOfBoundsException

            String t = "hi";
            int n = Integer.parseInt(t); // NumberFormatException

        }catch (ArithmeticException | NullPointerException e){
            System.out.println("Exception occurred");
        }
    }
}
