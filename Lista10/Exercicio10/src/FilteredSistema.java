public class FilteredSistema extends Sistema {
    private Sistema sistemaOriginal;

    public FilteredSistema(Sistema sistemaOriginal) {
        this.sistemaOriginal = sistemaOriginal;
    }

    @Override
    public void metodoA(String parametro) {
        if (parametro.equals("789")) {
            parametro = "987";
            System.out.println("🔧 Parâmetro alterado para segurança em metodoA.");
        }
        sistemaOriginal.metodoA(parametro);
    }

    @Override
    public void metodoB(String parametro) {
        if (parametro.equals("789")) {
            parametro = "987";
            System.out.println("🔧 Parâmetro alterado para segurança em metodoB.");
        }
        sistemaOriginal.metodoB(parametro);
    }
}
