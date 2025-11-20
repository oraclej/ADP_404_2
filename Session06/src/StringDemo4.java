public class StringDemo4 {
    public static void main(String[] args) {
        /*String email = "a.hemmati@iau.ac.ir";
        int n = email.indexOf("@");
        System.out.println(n);
        if(email.indexOf("#") >= 0){

        }
        if(email.contains("@")){

        }*/
        String date = "2003/02/01/23423/242/2342/6";
//        System.out.println(date.indexOf("/", 5));
//        System.out.println(date.lastIndexOf("/"));
        int i = 0;
        while (true){
            int t = date.indexOf("/",i);
            if(t == -1)
                break;
            System.out.println(t);
            i = t+1;
        }
    }
}
