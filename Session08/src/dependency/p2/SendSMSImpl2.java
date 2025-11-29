package dependency.p2;

public class SendSMSImpl2 implements SMSSender {
    @Override
    public boolean sendSMS(String message, String fromTelephoneNo, String toTelephoneNo) {
        return true;
    }
}
