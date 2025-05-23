public class Juros extends DividaDecorator {

    public Juros(Divida divida, double taxaJuros) {
        super(divida, taxaJuros);  // parametro = taxa de juros (ex.: 0.10 para 10%)
    }

    @Override
    public double calcularValor() {
        return divida.calcularValor() * (1 + parametro);
    }
}
