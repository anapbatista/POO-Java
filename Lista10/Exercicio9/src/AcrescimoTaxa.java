public class AcrescimoTaxa extends DividaDecorator {

    public AcrescimoTaxa(Divida divida, double taxaFixa) {
        super(divida, taxaFixa); // parametro = taxa fixa (ex.: 50 reais)
    }

    @Override
    public double calcularValor() {
        return divida.calcularValor() + parametro;
    }
}
