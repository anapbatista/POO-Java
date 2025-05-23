public class OperacaoFactory {
    public static Operacao criarOperacao(String operador) {
        switch (operador) {
            case "+":
                return new Soma();
            case "-":
                return new Substracao();
            case "*":
                return new Multiplicacao();
            case "/":
                return new Divisao();
            default:
                System.out.println("Operador inválido: " + operador);
                return null;
        }
    }
}
