// 1. Maiúsculas
public class ObserverMaiusculas implements Observer {
    @Override
    public void atualizar(String novaString) {
        System.out.println("Maiúsculas: " + novaString.toUpperCase());
    }
}
