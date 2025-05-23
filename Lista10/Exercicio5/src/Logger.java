import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instancia;

    // Construtor privado impede criação de objetos fora da classe
    private Logger() {}

    // Método para obter a única instância
    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Método para registrar uma mensagem com timestamp
    public void registrar(String mensagem) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] " + mensagem);
    }
}
