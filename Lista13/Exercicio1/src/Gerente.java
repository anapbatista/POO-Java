public class Gerente extends Aprovador {

    public Gerente(Aprovador proximo){
        super(proximo);
    }

    public void aprovar(SolicitacaoCompra s){
        if (s.getValorDeCompra() > 10000.0){
            proximo.aprovar(s);
        }else{
            System.out.println("Gerente aprovou a compra: "+ s.getDescricao() + "- R$ "+ s.getValorDeCompra()+"\n");
        }
    }

}