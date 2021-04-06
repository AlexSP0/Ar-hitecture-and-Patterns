import java.util.ArrayList;
import java.util.List;

public class PatientPublisher {
    List<PatientObserver> observers;
    public PatientPublisher() {
        observers = new ArrayList<>();
    }
    public void addObserver(PatientObserver observer) {
        observers.add(observer);
    }
    public void notifyObservers(int age) {
        for ( PatientObserver observer: observers) {
            observer.update(age);
        }
    }
}
