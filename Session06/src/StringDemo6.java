public class StringDemo6 {
    public static void main(String[] args) {
        String cardExpDate = "1408/02";
        String yearInput = "08";
        String monthInput = "02";
        String[] cardExp = cardExpDate.split("/");
        if(!monthInput.equals(cardExp[1])){
            System.out.println("Invalid Month");
        }else
        if(!yearInput.equals(cardExp[0].substring(2))){
            System.out.println("Invalid Year");
        }else{
            System.out.printf("OK");
        }

    }
}
