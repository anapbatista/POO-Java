public class DriverDeImpressao extends DriverDispositivo {

    private int paginasImpressas;

    public DriverDeImpressao(String nome, boolean ligado, int status) {
        super(nome, ligado, status);
        this.paginasImpressas = 0;
    }

    public void imprimePaginas(int quant) {
        if (this.isLigado() && quant > 0 && this.getStatus() == 1) {
            this.paginasImpressas += quant;
            System.out.println("Imprimindo...");
            System.out.println("Impressão realizada com sucesso!");
        } else {
            if (!this.isLigado())
                System.out.println("Impressora desligada.");
            else if (this.getStatus() == 0)
                System.out.println("Impressora com mal funcionamento.");
            else
                System.out.println("Quantidade de páginas inválida.");
        }

    }

    public int getPaginasImpressas() {
        return paginasImpressas;
    }

    

}
