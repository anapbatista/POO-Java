public class Vendedor extends Funcionario {

    private int vendas;
    private double percentualComissao;

    public Vendedor(String aNome, double aSalario, int quantVendas, double aPercentualComissao){
        super(aNome, aSalario);
        this.vendas = quantVendas;
        this.percentualComissao = aPercentualComissao;
    }

    public double calcularSalario(){
        return super.calcularSalario() + (vendas*percentualComissao/100);
    }


}
