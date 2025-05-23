public class Main {
    public static void main(String[] args) {
        Divida dividaBase = new Divida(1000);

        // Aplicando juros de 10%
        Divida dividaComJuros = new Juros(dividaBase, 0.10);

        // Aplicando desconto de 5% sobre a dívida com juros
        Divida dividaComDesconto = new JurosComDesconto(dividaComJuros, 0.05);

        // Acrescentando uma taxa fixa de R$50
        Divida dividaFinal = new AcrescimoTaxa(dividaComDesconto, 50);

        System.out.println("--- Cálculo da Dívida ---");
        System.out.println("Valor base: R$" + dividaBase.calcularValor());
        System.out.println("Com juros de 10%: R$" + dividaComJuros.calcularValor());
        System.out.println("Com desconto de 5%: R$" + dividaComDesconto.calcularValor());
        System.out.println("Com acréscimo de taxa R$50: R$" + dividaFinal.calcularValor());
    }
}
