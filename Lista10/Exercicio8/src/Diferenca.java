import java.util.ArrayList;

public class Diferenca implements Funcionalidade {

    @Override
    public void executar(ArrayList<Integer> vetor1, ArrayList<Integer> vetor2) {
        ArrayList<Integer> resultado = new ArrayList<>(vetor1);
        resultado.removeAll(vetor2);

        System.out.println("\n--- Diferença (Vetor1 - Vetor2) ---");
        System.out.println("Vetor1: " + vetor1);
        System.out.println("Vetor2: " + vetor2);
        System.out.println("Resultado (Diferença): " + resultado);
    }
}
