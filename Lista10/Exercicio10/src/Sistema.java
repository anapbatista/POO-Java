public class Sistema {
    public void metodoA(String parametro) {
        if (parametro.equals("789")) {
            System.out.println("⚠️ Sistema vulnerável! (metodoA)");
        } else {
            System.out.println("Executando metodoA com parâmetro: " + parametro);
        }
    }

    public void metodoB(String parametro) {
        if (parametro.equals("789")) {
            System.out.println("⚠️ Sistema vulnerável! (metodoB)");
        } else {
            System.out.println("Executando metodoB com parâmetro: " + parametro);
        }
    }
}
