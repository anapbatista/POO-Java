public class Main {
    public static void main(String[] args) {
        // Criando um pedido com capacidade para 3 itens
        Pedido pedido = new Pedido(3);

        // Criando alguns itens
        Item item1 = new Item("Caneta", 2.50, 10);
        Item item2 = new Item("Caderno", 15.00, 2);
        Item item3 = new Item("Borracha", 1.50, 5);
        Item item4 = new Item("Mochila", 120.00, 1); // Excedendo o limite

        // Adicionando itens ao pedido
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        // Tentando adicionar um item além do limite
        pedido.adicionarItem(item4);

        // Exibindo os itens do pedido
        System.out.println("\nItens do pedido:");
        pedido.exibirPedido();

        // Calculando e exibindo o total do pedido
        System.out.println("\nTotal do pedido: R$" + pedido.calcularTotal());
    }
}