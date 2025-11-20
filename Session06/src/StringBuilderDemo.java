public class StringBuilderDemo {
    public static void main(String[] args) {
        /*String t = "1";
        for (int i = 0; i < 1000; i++) {
            t += "1";
        }*/
        /*long t1 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            builder.append("1");
        }
        String t = builder.toString();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);*/

        long t1 = System.currentTimeMillis();
        String t = "1";
        for (int i = 0; i < 1_000_000; i++)
            t += "1";
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
