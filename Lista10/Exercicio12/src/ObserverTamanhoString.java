// 3. Concatena tamanho da string
public class ObserverTamanhoString implements Observer {
    @Override
    public void atualizar(String novaString) {
        System.out.println("Tamanho concatenado: " + novaString + novaString.length());
    }
}
