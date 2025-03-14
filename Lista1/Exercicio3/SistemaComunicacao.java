

public class SistemaComunicacao {
    private String operadora;

    public SistemaComunicacao(String operadora) {
        this.operadora = operadora;
    }

    public void fazerChamada(String numero) {
        if (verificarSinal()) {
            System.out.println("Ligando para " + numero + " pela operadora " + operadora + "...");
        } else {
            System.out.println("Sem sinal para realizar a chamada.");
        }
    }

    private boolean verificarSinal() {
        System.out.println("Verificando sinal da rede...");
        return true; // Simulação de sempre ter sinal
    }
}
