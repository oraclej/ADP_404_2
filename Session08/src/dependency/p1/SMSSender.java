package dependency.p1;

public class SMSSender {
    public boolean sendMessage(String message, String fromTelephoneNo, String toTelephoneNo) {
        System.out.println("Sending a message to " + toTelephoneNo);
        return true;
    }
}
