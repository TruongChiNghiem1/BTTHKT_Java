package observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private List<Observer> observers = new ArrayList<>();

    private String status = "Pending";

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update("Trạng thái công việc mới: " + status);
        }
    }
}
