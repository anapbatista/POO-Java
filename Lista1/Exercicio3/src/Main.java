package Lista1.Exercicio3.src;

public class Main {
    public static void main(String[] args) {
        Celular meuCelular = new Celular();
        meuCelular.ligar();

        meuCelular.abrirAplicativo("WhatsApp");
        meuCelular.tocarNaTela(500, 1000);
        meuCelular.tocarSom("Música.mp3");
        meuCelular.ligarPara("11987654321");
    }
}
