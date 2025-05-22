public class Estoque {

    private Produto[] produtos;
    private int indiceAtual;

    public Estoque() {
        this.produtos = new Produto[100];
        this.indiceAtual = 0;
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (int i = 0; i < indiceAtual; i++) {
            if (produtos[i] != null && produtos[i].getNome() == nome) {
                return produtos[i];
            }
        }
        return null;
    }

    public void adicionarProduto(Produto produto) {
        Produto a = buscarProdutoPorNome(produto.getNome());
        if (a == null && indiceAtual <= produtos.length) {
            produtos[indiceAtual] = produto;
            indiceAtual++;
        } else if (a != null) {
            System.out.println("Produto já existe no estoque.");
        } else {
            System.out.println("Estoque cheio!");
        }

    }

    public boolean removerProdutoPorId(int id) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getid() == id) {
                produtos[i] = null;
                System.out.println("Produto removido com sucesso!");
                return true;

            }
        }
        return false;
    }

    public void tostring() {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println(produtos[i].toString());
                System.out.println(" ");

            }

        }

    }
}