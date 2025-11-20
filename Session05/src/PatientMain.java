public class PatientMain {
    public static void main(String[] args) {
        Patient ali = new Patient();
        ali.setName("Ali");
        ali.setAge(40);
        ali.setSugar(120);
//        if(ali.getSugar() > Patient.SUGAR_THRESHOLD)
        if(ali.isDiabetic())
            System.out.println("is Diabetic");
        else
            System.out.println("is Normal");
    }
}
