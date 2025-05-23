import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class Uniao implements Funcionalidade {

    @Override
    public void executar(ArrayList<Integer> vetor1, ArrayList<Integer> vetor2) {
        Set<Integer> resultado = new LinkedHashSet<>(vetor1);
        resultado.addAll(vetor2);

        System.out.println("\n--- União ---");
        System.out.println("Vetor1: " + vetor1);
        System.out.println("Vetor2: " + vetor2);
        System.out.println("Resultado (União): " + resultado);
    }
}
