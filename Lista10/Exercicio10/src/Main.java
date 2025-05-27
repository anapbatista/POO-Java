public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sem proteção ===");
        Sistema sistema = new Sistema();
        sistema.metodoA("123");
        sistema.metodoA("789");
        sistema.metodoB("789");

        System.out.println("\n=== Com Proxy de Segurança ===");
        ProxySegurancaSistema proxy = new ProxySegurancaSistema(new Sistema());
        proxy.metodoA("123");
        proxy.metodoA("789");
        proxy.metodoB("789");

        System.out.println("\n=== Com Decorator (Filtragem) ===");
        FilteredSistema filtro = new FilteredSistema(new Sistema());
        filtro.metodoA("123");
        filtro.metodoA("789");
        filtro.metodoB("789");
    }
}
