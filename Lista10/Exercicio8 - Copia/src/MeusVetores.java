import java.util.ArrayList;

public class MeusVetores {
    private ArrayList<Integer> vetor1;
    private ArrayList<Integer> vetor2;

    public MeusVetores(ArrayList<Integer> v1, ArrayList<Integer> v2) {
        this.vetor1 = v1;
        this.vetor2 = v2;
    }

    public void executarOperacao(String tipo) {
        OperacaoConjunto operacao = OperacaoFactory.criarOperacao(tipo);
        ArrayList<Integer> resultado = operacao.executar(vetor1, vetor2);

        System.out.println("\n--- " + tipo.toUpperCase() + " ---");
        System.out.println("Vetor1: " + vetor1);
        System.out.println("Vetor2: " + vetor2);
        System.out.println("Resultado: " + resultado);
    }
}
