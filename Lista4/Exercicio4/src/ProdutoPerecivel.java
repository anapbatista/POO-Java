import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoPerecivel extends Produto {
    protected LocalDate dataValidade;

    public ProdutoPerecivel(int codigo, double preco, String descricao, int quantidade, LocalDate dataValidade) {
        super(codigo, preco, descricao, quantidade);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int retirarDoEstoque(int quantidadeRetirada, LocalDate dataAtual) {
        long diasParaVencer = ChronoUnit.DAYS.between(dataAtual, dataValidade);
        if (diasParaVencer <= 30) {
            this.quantidade = 0;
            return 0;
        }
        return super.retirarDoEstoque(quantidadeRetirada);
    }

    public void acrescentarAoEstoque(int quantidadeAcrescida) {
        if (this.quantidade == 0) {
            this.quantidade += quantidadeAcrescida;
        }
        // não faz nada se já há estoque
    }
}
