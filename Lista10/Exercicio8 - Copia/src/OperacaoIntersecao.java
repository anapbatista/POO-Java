import java.util.ArrayList;

public class OperacaoIntersecao implements OperacaoConjunto {
    @Override
    public ArrayList<Integer> executar(ArrayList<Integer> vetor1, ArrayList<Integer> vetor2) {
        ArrayList<Integer> resultado = new ArrayList<>(vetor1);
        resultado.retainAll(vetor2);
        return resultado;
    }
}
