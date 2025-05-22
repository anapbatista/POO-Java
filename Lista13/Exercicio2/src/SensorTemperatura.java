import java.util.ArrayList;

public class SensorTemperatura {
    private ArrayList<ObservadorTemperatura> lista = new ArrayList<>();

    public void adicionar(ObservadorTemperatura o) {
        lista.add(o);
    }

    public void remover(ObservadorTemperatura o) {
        lista.remove(o);
    }

    public void SetTemperatura(double temperatura) {
        for (ObservadorTemperatura o : lista) {
            o.atualizar(temperatura);
        }
    }

}
