public class Pedido {
    Item[] itens;
    int quantidadeItens;
    final int tamanhoMaximo;

    public Pedido(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.itens = new Item[tamanhoMaximo];
        quantidadeItens = 0;
    }

    public void adicionarItem(Item item) {
        if (quantidadeItens < tamanhoMaximo) {
            itens[quantidadeItens] = item;
            quantidadeItens++;
        } else {
            System.out.println("Não é possível adicionar mais itens ao pedido.");
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeItens; i++) {
            total += (itens[i].precoUnitario) * (itens[i].quantidade);
        }
        return total;
    }

    public void exibirPedido(){
        for (int i=0; i<quantidadeItens; i++){
            System.out.println("Item: " + itens[i].nome + ", Preço: " + itens[i].precoUnitario + ", Quantidade: " + itens[i].quantidade);
        }
    }
}
