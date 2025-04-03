public class Main {
    public static void main(String[] args) {
        NumeroComplexo c1 = new NumeroComplexo(3, 4);
        NumeroComplexo c2 = new NumeroComplexo(1, -2);
        System.out.println(c1);
        System.out.println(c1.modulo());
        System.out.println(c2);
        System.out.println(c2.modulo());
        CalculadoraComplexa calculadora = new CalculadoraComplexa();
        calculadora.setOperacao(new SomaComplexa());
        NumeroComplexo resultadoSoma = calculadora.calcular(c1, c2);
        System.out.println("Soma: " + resultadoSoma);
        calculadora.setOperacao(new MultiplicacaoComplexa());
        NumeroComplexo resultadoMultiplicacao = calculadora.calcular(c1, c2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
    }
}
