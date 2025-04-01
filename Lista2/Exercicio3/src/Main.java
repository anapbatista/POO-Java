public class Main {
    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Ana", 24, "111.222.333-44");
        Usuario user2 = new Usuario("João", 30, "444.555.666-77");

        OperacaoMat operacao1= new OperacaoMat(2.7f, 3.8f);
        float result1 = operacao1.realizaCalculo(0); //soma
        ResultadoOperacao operacao11 = new ResultadoOperacao(user1, 1, 4, 2025, "SOMA", result1);
        operacao11.exibirResultado();

        
        OperacaoMat operacao2= new OperacaoMat(14.6f, 3.8f);
        float result2 = operacao2.realizaCalculo(3); //divisao
        ResultadoOperacao operacao22 = new ResultadoOperacao(user2, 1, 4, 2025, "DIVISAO", result2);
        operacao22.exibirResultado();



    }
}
