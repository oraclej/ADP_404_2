public class StringMain {
    public static void main(String[] args) {
        String s = "1";
        for (int i = 0; i < 1000; i++) {
            s += "0";
        }
        /// /////////
        String email = "a.hemmati@iau.ac.ir";
        if(!email.isEmpty()){
        }
        if(email.isBlank()){}
        if(email.endsWith("ac.ir")){}
        if(email.startsWith("a.")){}
        if(email.contains("@")){}
        if(email.equals("a.HEMMATI@iau.ac.ir")){}
        if(email.equalsIgnoreCase("a.HEMMATI@iau.ac.ir")){}
        String t1 = email.toLowerCase();
        String t2 = email.toUpperCase();
        char c = email.charAt(0);
        int l = email.length();
        String password = "123";
        if(password.length() < 6){
            System.out.println("Short Password");
        }

    }
}
