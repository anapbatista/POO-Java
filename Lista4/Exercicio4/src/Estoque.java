import java.util.ArrayList;
import java.time.LocalDate;


public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto p) {
        produtos.add(p);
    }

    public Produto consultarProduto(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) return p;
        }
        return null;
    }

    public int retirarProduto(int codigo, int quantidade) {
        Produto p = consultarProduto(codigo);
        if (p != null) {
            if (p instanceof ProdutoPerecivel) {
                ProdutoPerecivel perecivel = (ProdutoPerecivel) p;
                return perecivel.retirarDoEstoque(quantidade, LocalDate.now());
            
            
            } else {
                return p.retirarDoEstoque(quantidade);
            }
        }
        return 0;
    }

    public double custoTotalEstoque() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco() * p.getQuantidade();
        }
        return total;
    }

    public void imprimirProdutos() {
        for (Produto p : produtos) {
            p.imprimirDescricao();
        }
    }
}
