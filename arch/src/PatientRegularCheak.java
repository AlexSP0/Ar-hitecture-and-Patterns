public class PatientRegularCheak implements PatientObserver {

    @Override
    public void update(int age) {
        if(age%2 == 0 && age> 30) {
            System.out.println("Необходимо пройти диспасеризацию");
        }
    }

}
