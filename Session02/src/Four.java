import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Hello " + name);
        System.out.print("Enter your age:");
        int n = input.nextInt();
        System.out.println("AGE=" + n);
    }
}
