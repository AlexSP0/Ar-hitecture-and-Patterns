public class Main {
    public static void main(String[] args) {
        Patient.PatientBuilder builder = new Patient.PatientBuilder("Alexander", "Pushkin");
        Patient patient = builder.setAddress("Russia").setAge(222).build();
        patient.Display();
    }
}
