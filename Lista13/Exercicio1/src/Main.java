public class Main {
    public static void main(String[] args) {

        SolicitacaoCompra s1 = new SolicitacaoCompra(5000, "Geladeira nova para o refeitório\n");
        SolicitacaoCompra s2 = new SolicitacaoCompra(20000, "Sistema de ar condicionado para o escritório 1\n");
        SolicitacaoCompra s3 = new SolicitacaoCompra(500, "Reposição de Descartáveis\n");

        Aprovador cadeia = new Supervisor(new Gerente(new Diretor(null)));

        cadeia.aprovar(s1);
        cadeia.aprovar(s2);
        cadeia.aprovar(s3);
        


    }

}
