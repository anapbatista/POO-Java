

public class Celular {
    private Processador processador;
    private TelaTouch tela;
    private SistemaSom som;
    private SistemaComunicacao comunicacao;

    public Celular() {
        this.processador = new Processador(2500);
        this.tela = new TelaTouch(1080, 1920);
        this.som = new SistemaSom(50);
        this.comunicacao = new SistemaComunicacao("Vivo");
    }

    public void ligar() {
        System.out.println("Ligando o celular...");
    }

    public void abrirAplicativo(String app) {
        processador.executarAplicativo(app);
    }

    public void tocarNaTela(int x, int y) {
        tela.toqueNaTela(x, y);
    }

    public void tocarSom(String musica) {
        som.reproduzirSom(musica);
    }

    public void ligarPara(String numero) {
        comunicacao.fazerChamada(numero);
    }
}
