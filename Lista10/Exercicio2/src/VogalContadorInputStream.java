import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class VogalContadorInputStream extends FilterInputStream {
  
    private int totalVogaisLidas;
    private final String vogais = "aAeEiIoOuU";

    public VogalContadorInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int caractere = super.read();
        if (caractere != -1) {
            char c = (char) caractere;
            if (vogais.contains(String.valueOf(c))) {
                totalVogaisLidas++;
            }
        }
        return caractere;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int resultado = super.read(b, off, len);
        if (resultado != -1) {
            for (int i = off; i < off + resultado; i++) {
                char c = (char) b[i];
                if (vogais.contains(String.valueOf(c))) {
                    totalVogaisLidas++;
                }
            }
        }
        return resultado;
    }

    public int getTotalVogaisLidas() {
        return totalVogaisLidas;
    }
}
