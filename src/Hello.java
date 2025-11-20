import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        System.out.println("m+n=" + (m+n));

        float d = 0.1F;
        System.out.println(d+0.2);

        for (double i = 0; i <= 1 ; i+=0.1) {
            System.out.println(i);
        }

        BigDecimal bd = new BigDecimal("2.4");
        bd.add(new BigDecimal("1.2"));

        final int t = 2;
        if(t==2){
            int e = 3;
        }

        switch (t%2){
            case 0:
            case 1:
                System.out.println("zero or one");
        }

        int f = 3;
        f+=2;
        int r = f+2;
        System.out.print(f+2);


    }
}
