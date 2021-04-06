public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Alexander", 20);
        PatientRegularCheak patCheck = new PatientRegularCheak();
        PatientGetNewHealthInsurancePolicy patInsurance = new PatientGetNewHealthInsurancePolicy();
        patient.addObserver(patCheck);
        patient.addObserver(patInsurance);
        patient.setAge(26);
        System.out.println("Возраст пациента изменился!");
        patient.setAge(33);
        System.out.println("Возраст пациента изменился!");
        patient.setAge(36);

    }
}
