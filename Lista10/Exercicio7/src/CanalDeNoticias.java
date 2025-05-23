import java.util.ArrayList;
import java.util.List;

public class CanalDeNoticias implements Sujeito {

    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }

    public void novaNoticia(String noticia) {
        System.out.println("\n[CANAL] Nova notícia publicada: " + noticia);
        notificarObservadores(noticia);
    }
}
