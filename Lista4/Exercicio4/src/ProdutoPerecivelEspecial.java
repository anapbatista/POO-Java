import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class ProdutoPerecivelEspecial extends ProdutoPerecivel {

    public ProdutoPerecivelEspecial(int codigo, double preco, String descricao, int quantidade, LocalDate dataValidade) {
        super(codigo, preco, descricao, quantidade, dataValidade);
    }

    public void imprimirNotaControle() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Controle: Código %d, Descrição: %s, Estoque: %d, Validade: %s%n", 
            codigo, descricao, quantidade, dataValidade.format(fmt));
    }
}
