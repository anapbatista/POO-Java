public class Main {
    public static void main(String[] args) {
        
        Processador p = new ProcessadorMultiploDe2(new ProcessadorMultiploDe3(new ProcessadorDefault(null)));

        p.processar(22);
        p.processar(9);
        p.processar(49);
    }
}
