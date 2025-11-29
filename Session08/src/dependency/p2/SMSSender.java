package dependency.p2;

public interface SMSSender {
    boolean sendSMS(String message, String fromTelephoneNo, String toTelephoneNo);
}
