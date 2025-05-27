import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();

        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);

        v2.add(2);
        v2.add(4);
        v2.add(6);

        MeusVetores meusVetores = new MeusVetores(v1, v2);

        meusVetores.executarOperacao("uniao");
        meusVetores.executarOperacao("intersecao");
        meusVetores.executarOperacao("diferenca");
    }
}
