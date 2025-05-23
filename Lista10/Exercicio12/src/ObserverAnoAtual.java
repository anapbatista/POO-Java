// 2. Concatena ano atual
import java.time.Year;

public class ObserverAnoAtual implements Observer {
    @Override
    public void atualizar(String novaString) {
        int ano = Year.now().getValue();
        System.out.println("Ano atual concatenado: " + novaString + ano);
    }
}
