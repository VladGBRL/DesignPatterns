import java.util.ArrayList;
import java.util.List;
public class Prelungitor {
    private List<Observer> observers = new ArrayList<>();

    // Metoda pentru adăugarea unui observator
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Metoda pentru notificarea observatorilor
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Metoda care simulează băgarea prelungitorului în priză
    public void plugIn() {
        notifyObservers("Prelungitorul a fost băgat în priză.");
    }

    // Metoda care simulează scoaterea prelungitorului din priză
    public void unplug() {
        notifyObservers("Prelungitorul a fost scos din priză.");
    }
}
