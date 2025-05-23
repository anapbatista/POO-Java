import java.util.ArrayList;

public class MeusVetores {

    private ArrayList<Integer> vetor1;
    private ArrayList<Integer> vetor2;
    private Funcionalidade funcionalidade;

    public MeusVetores(ArrayList<Integer> v1, ArrayList<Integer> v2, Funcionalidade funcionalidade) {
        this.vetor1 = v1;
        this.vetor2 = v2;
        this.funcionalidade = funcionalidade;
    }

    public void executar() {
        funcionalidade.executar(vetor1, vetor2);
    }

    public void setFuncionalidade(Funcionalidade funcionalidade) {
        this.funcionalidade = funcionalidade;
    }
}
