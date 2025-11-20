public class StringDemo1 {
    public static void main(String[] args) {
        String email  = "a.hemmati@iau.ac.ir";
        /*int n = email.compareToIgnoreCase("d.tahmasebi");
        System.out.println(n);
        if(n>0){

        }else if(n < 0){

        }else{

        }*/

        System.out.println(email);
        email = email.replace("i", "P");
        System.out.println(email);
    }
}
