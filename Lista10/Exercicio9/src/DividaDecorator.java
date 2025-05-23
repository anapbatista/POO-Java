public abstract class DividaDecorator extends Divida {
    protected Divida divida;
    protected double parametro;

    public DividaDecorator(Divida divida, double parametro) {
        super(divida.getValorBase());
        this.divida = divida;
        this.parametro = parametro;
    }

    @Override
    public abstract double calcularValor();
}
