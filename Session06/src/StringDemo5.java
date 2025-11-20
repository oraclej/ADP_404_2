public class StringDemo5 {
    public static void main(String[] args) {
        String date = "     2003 / 0 2   /0   1    ";
        System.out.println(date.substring(0, 4));
        System.out.println(date.trim().replace(" ",""));
    }
}
