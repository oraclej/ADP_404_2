package edu.iaun.exceptions;

public class Demo2 {
    public static void main(String[] args) {
        try{
            System.out.println(2/1); // ArithmeticException

            int[] arr = {1,2,3};
            System.out.println(arr[0]); //ArrayIndexOutOfBoundsException

            String t = "hi";
            int n = Integer.parseInt(t); // NumberFormatException

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e2){
            System.out.println(e2.getMessage());
        }catch (ArrayIndexOutOfBoundsException e3){
            System.out.println(e3.getMessage());
        }catch (Exception e4){
            System.out.println(e4.getMessage());
        }
        System.out.println("Bye");
    }
}
