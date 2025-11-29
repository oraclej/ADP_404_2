package dependency.p1;

public class Main {
    public static void main(String[] args) {
        String text = "Hello Friend";
        String fromTelephoneNo = "09132589632";
        String toTelephoneNo = "0913698741";
        SMSSender2 smssender = new SMSSender2();
        int n = smssender.sendSMS(fromTelephoneNo, toTelephoneNo, text);
        if(n == 0)
            System.out.println("message is sent");
        else
            System.out.println("message is not sent");
    }
}
