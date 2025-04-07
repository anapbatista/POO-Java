import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        ProdutoPerecivel leite = new ProdutoPerecivel(1, 4.50, "Leite", 20, LocalDate.now().plusDays(10));
        ProdutoPerecivelEspecial carne = new ProdutoPerecivelEspecial(2, 25.0, "Carne Bovina", 15, LocalDate.now().plusDays(40));
        ProdutoNaoPerecivel panela = new ProdutoNaoPerecivel(3, 120.0, "Panela Antiaderente", 10, 5);

        estoque.cadastrarProduto(leite);
        estoque.cadastrarProduto(carne);
        estoque.cadastrarProduto(panela);

        System.out.println("Produto buscado (código 2):");
        Produto encontrado = estoque.consultarProduto(2);
        if (encontrado != null) {
            encontrado.imprimirDescricao();
        }

        System.out.println("\nRetirando 5 unidades do produto 1:");
        int retirada = estoque.retirarProduto(1, 5);
        System.out.println("Quantidade retirada: " + retirada);

        System.out.println("\nCusto total do estoque: R$ " + estoque.custoTotalEstoque());

        System.out.println("\nTodos os produtos no estoque:");
        estoque.imprimirProdutos();

        System.out.println("\nNota de controle do produto perecível especial:");
        carne.imprimirNotaControle();
    }
}
