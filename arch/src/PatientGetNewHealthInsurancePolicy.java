public class PatientGetNewHealthInsurancePolicy implements PatientObserver {
    @Override
    public void update(int age) {
        if(age%3 == 0 && age> 30) {
            System.out.println("Необходимо получить новый страховой полис!");
        }
    }
}
