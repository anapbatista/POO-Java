public class Diretor extends Aprovador {

    public Diretor(Aprovador prox){
        super(prox);
        
    }

    public void aprovar(SolicitacaoCompra s) {
        System.out.println("Diretor aprovou a compra: " + s.getDescricao() + "- R$ " + s.getValorDeCompra()+"\n");

    }

}