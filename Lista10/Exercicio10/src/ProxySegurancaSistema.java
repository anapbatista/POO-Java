public class ProxySegurancaSistema extends Sistema {
    private Sistema sistemaReal;

    public ProxySegurancaSistema(Sistema sistemaReal) {
        this.sistemaReal = sistemaReal;
    }

    @Override
    public void metodoA(String parametro) {
        if (parametro.equals("789")) {
            System.out.println("🚫 Acesso negado para metodoA com parâmetro vulnerável!");
        } else {
            sistemaReal.metodoA(parametro);
        }
    }

    @Override
    public void metodoB(String parametro) {
        if (parametro.equals("789")) {
            System.out.println("🚫 Acesso negado para metodoB com parâmetro vulnerável!");
        } else {
            sistemaReal.metodoB(parametro);
        }
    }
}
