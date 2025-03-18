public class DriverDispositivo {

    protected String nome;
    protected boolean ligado;
    protected int status; // 1-Funcionando corretamente / 0 - Erro

    public DriverDispositivo(String nome, boolean ligado, int status) {
        this.nome = nome;
        this.ligado = ligado;
        this.status = status;
    }

    public void ligaDispositivo() {
        this.ligado = true;
    }

    public String verificaStatus() {
        if (this.status == 1) {
            return "Funcionando corretamente";
        } else {
            return "Erro";
        }
    }

    public void executaTeste() {
        if (this.ligado && status == 1) {
            System.out.println("Teste executado com sucesso!");
        } else {
            if (!this.ligado)
                System.out.println("Dispositivo " + nome + " desligado!");
            else
                System.out.println("Dispositivo " + nome + " com erro!");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    

}
