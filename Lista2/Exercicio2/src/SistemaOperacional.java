public class SistemaOperacional {

    private String nome;
    private String versao;
    private int arquiteturaBits;
    private DriverDispositivo[] dispositivos;
    private boolean status;

    public SistemaOperacional(String nome, String versao, int arquiteturaBits, DriverDispositivo[] dispositivos,
            boolean status) {
        this.nome = nome;
        this.versao = versao;
        this.arquiteturaBits = arquiteturaBits;
        this.dispositivos = dispositivos;
        this.status = status;
    }

    public boolean addDriver(DriverDispositivo aDriver) {
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] == null) {
                dispositivos[i] = aDriver;
                return true;
            }
        }
        return false;
    }

    public boolean ligaTodosDispositivos() {
        boolean todosLigados = true;

        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && !dispositivos[i].isLigado()) {
                dispositivos[i].ligaDispositivo();
                todosLigados = false;
            }
        }

        return todosLigados;
    }

    public void executaTestes() {
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null) {
                dispositivos[i].executaTeste();
            }
        }

    }

    public void imprimeSistemaOperacional(){
        System.out.println("Nome: " + nome);
        System.out.println("Versão: " + versao);
        System.out.println("Arquitetura: " + arquiteturaBits + " bits");
        System.out.println("Status: " + status);
        }

    public void isLigado(){
        System.out.println("Ligado!");
        this.status = true;
    }

    public void desligaSO() {
        this.status = false;
        System.out.println("Desligado.");
    }

    public boolean isStatus() {
        return status;
    }

    
}
