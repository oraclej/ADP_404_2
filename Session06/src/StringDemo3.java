import java.util.Calendar;
import java.util.Date;

public class StringDemo3 {
    public static void main(String[] args) {
        String date = "2003/02/01";
        System.out.println(date.replace("/", "-"));
        String[] d = date.split("/");
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        int year = Integer.parseInt(d[0]);
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println((todayYear - year) + " Years old");
    }
}
