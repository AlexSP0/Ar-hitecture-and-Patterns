public class Patient extends PatientPublisher {
    private String name;
    private int age;
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void setAge (int age) {
        this.age = age;
        notifyObservers(age);
    }
    public int getAge() {
        return age;
    }
}
