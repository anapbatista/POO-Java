import java.util.ArrayList;
import java.util.List;

public class Sujeito {
    private List<Observer> observers;

    public Sujeito(){

        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    public void setNovaString(String s) {
        for (Observer o : observers) {
            o.atualizar(s);
        }
    }
}
