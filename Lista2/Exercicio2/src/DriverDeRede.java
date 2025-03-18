public class DriverDeRede extends DriverDispositivo {

    private int pacotesEnviados;

    public DriverDeRede(String nome, boolean ligado, int status) {
        super(nome, ligado, status);
        this.pacotesEnviados = 0;
    }

    public void enviaPacoteDeDados(int pacoteDeDados) {
        if (pacoteDeDados > 0 && this.isLigado() && this.getStatus() == 1) {
            pacotesEnviados += pacoteDeDados;
            System.out.println("Pacote enviado. Total: " + pacotesEnviados);
        } else {
            if (pacoteDeDados <= 0) {
                System.out.println("Número inválido de pacotes.");
            } else if (!this.isLigado()) {
                System.out.println("Dispositivo" + this.getNome() + " desligado.");
            } else if (this.getStatus() == 0) {
                System.out.println("Dispositivo " + this.getNome() + " não está funcionando.");
            }

        }
    }

    public int getPacotesEnviados() {
        return pacotesEnviados;
    }

}
