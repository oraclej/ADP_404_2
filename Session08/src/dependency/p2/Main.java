package dependency.p2;

public class Main {
    public static void main(String[] args) {
        String text = "Hello Friend";
        String fromTelephoneNo = "09132589632";
        String toTelephoneNo = "0913698741";

        SMSSender smsSender = new SendSMSImpl2();
        boolean isSent = smsSender.sendSMS(text, fromTelephoneNo, toTelephoneNo);
        if(isSent)
            System.out.println("message is sent");
        else
            System.out.println("message is not sent");

    }
}
