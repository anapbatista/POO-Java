public class Supervisor extends Aprovador {

    public Supervisor(Aprovador proximo){
        super(proximo);
    }

    public void aprovar(SolicitacaoCompra s){
        if (s.getValorDeCompra() >1000.0){
            proximo.aprovar(s);
        }else{
            System.out.println("Supervisor aprovou a compra: "+ s.getDescricao() + "- R$ "+ s.getValorDeCompra() +"\n");
        }
    }

}
