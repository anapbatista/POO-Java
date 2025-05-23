public class JurosComDesconto extends DividaDecorator {

    public JurosComDesconto(Divida divida, double percentualDesconto) {
        super(divida, percentualDesconto); // parametro = desconto (ex.: 0.05 para 5%)
    }

    @Override
    public double calcularValor() {
        double valorComJuros = divida.calcularValor();
        return valorComJuros * (1 - parametro);
    }
}
