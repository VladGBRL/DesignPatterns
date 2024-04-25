import java.util.List;
import java.util.ArrayList;
import java.util.Random;

// Clasa ConcreteSubject
class Curs implements Subject {
    private String numeCurs;
    private List<Observer> studenti;

    public Curs(String numeCurs) {
        this.numeCurs = numeCurs;
        this.studenti = new ArrayList<>();
    }

    public void addObserver(Observer observer) {

        studenti.add(observer);
    }

    public void removeObserver(Observer observer) {
        studenti.remove(observer);
    }

    public void notifyObservers() {
        Random random = new Random();
        for (Observer observer : studenti) {
            String status = random.nextBoolean() ? "prezent" : "absent";
            observer.update(numeCurs, status);
        }
    }

    public void prezenta() {
        System.out.println("Prezența la cursul " + numeCurs + ":");
        notifyObservers();
    }
}
