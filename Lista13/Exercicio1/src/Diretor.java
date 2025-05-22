public class Diretor extends Aprovador {

    public Diretor(){
        super(null);
        
    }

    public void aprovar(SolicitacaoCompra s) {
        System.out.println("Diretor aprovou a compra: " + s.getDescricao() + "- R$ " + s.getValorDeCompra()+"\n");

    }

}