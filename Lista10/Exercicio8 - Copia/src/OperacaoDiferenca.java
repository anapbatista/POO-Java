import java.util.ArrayList;

public class OperacaoDiferenca implements OperacaoConjunto {
    @Override
    public ArrayList<Integer> executar(ArrayList<Integer> vetor1, ArrayList<Integer> vetor2) {
        ArrayList<Integer> resultado = new ArrayList<>(vetor1);
        resultado.removeAll(vetor2);
        return resultado;
    }
}
