public class CalculadoraFacade {

    public static double calcular(String operador, double a, double b) {
        Operacao op = OperacaoFactory.criarOperacao(operador);
        return op.calcular(a, b);

    }

    public static double calcularExpressao(String expressao) {
        String[] elementos = expressao.trim().split("\\s+");

        if (elementos.length != 3) {
            System.out.println("Expressão inválida. Use o formato: número operador número");
        }

        try {
            double a = Double.parseDouble(elementos[0]);
            String operador = elementos[1];
            double b = Double.parseDouble(elementos[2]);

            return calcular(operador, a, b);
        } catch (NumberFormatException e) {
            System.out.println("Números inválidos na expressão.");
        }
        return 0;
    }

}
