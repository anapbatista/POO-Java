public class Main {
    public static void main(String[] args) {

        SolicitacaoCompra s1 = new SolicitacaoCompra(5000, "Geladeira nova para o refeitório\n");
        SolicitacaoCompra s2 = new SolicitacaoCompra(20000, "Sistema de ar condicionado para o escritório 1\n");

        Aprovador cadeia = new Supervisor(new Gerente(new Diretor()));

        cadeia.aprovar(s1);
        cadeia.aprovar(s2);
        


    }

}
