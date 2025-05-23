public class App {
   public static void main(String[] args) {

        ModuloUsuario usuario = new ModuloUsuario();
        ModuloPagamento pagamento = new ModuloPagamento();
        ModuloRelatorio relatorio = new ModuloRelatorio();

        usuario.login();
        pagamento.processarPagamento();
        relatorio.gerarRelatorio();

        // Verificação se todas as instâncias de Logger são a mesma
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();
        Logger logger3 = Logger.getInstancia();

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nTodas as instâncias de Logger são a mesma (Singleton confirmado).");
        } else {
            System.out.println("\nAs instâncias de Logger são diferentes (ERRO no Singleton).");
        }
    }
}
