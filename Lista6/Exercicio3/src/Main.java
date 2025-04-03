import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MetodoPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new CartaoCredito("1234-5678-9876-5432", 1000));
        pagamentos.add(new Pix("usuario@pix.com"));
        pagamentos.add(new BoletoBancario("23793", "2025-04-10"));
        double valorCompra = 300;

        double total = 0;

        for (MetodoPagamento metodo : pagamentos) {
            metodo.realizarPagamento(valorCompra);
            total += metodo.getTaxaPagamento();
        }
        System.out.printf("Custo total com taxas: R$ %.2f%n", total);
    }

}
