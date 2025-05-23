import java.util.ArrayList;

public class Interseccao implements Funcionalidade {

    @Override
    public void executar(ArrayList<Integer> vetor1, ArrayList<Integer> vetor2) {
        ArrayList<Integer> resultado = new ArrayList<>(vetor1);
        resultado.retainAll(vetor2);

        System.out.println("\n--- Intersecção ---");
        System.out.println("Vetor1: " + vetor1);
        System.out.println("Vetor2: " + vetor2);
        System.out.println("Resultado (Intersecção): " + resultado);
    }
}
