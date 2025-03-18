public class Main {
    public static void main(String[] args) {
        // Criando um sistema operacional
        SistemaOperacional so = new SistemaOperacional("Linux", "Ubuntu 22.04", "64 bits");

        // Criando drivers
        DriverDeRede rede = new DriverDeRede();
        DriverDeImpressao impressora = new DriverDeImpressao();
        DriverDeVideo video = new DriverDeVideo();

        // Adicionando drivers ao SO
        so.addDriver(rede);
        so.addDriver(impressora);
        so.addDriver(video);

        // Exibindo informações do SO antes de ligar
        so.imprimeSistemaOperacional();

        // Ligando o sistema operacional
        System.out.println("\nLigando o SO...");
        so.isLigado();

        // Executando testes
        System.out.println("\nExecutando testes nos dispositivos:");
        so.executaTestes();

        // Exibindo status atualizado
        so.();

        // Realizando operações específicas
        rede.enviaPacoteDeDados();
        impressora.imprimePaginas(10);
        video.alteraBrilhoDeExibicao(90);

        // Desligando o sistema
        System.out.println("\nDesligando o SO...");
        so.desligaSO();
    }
}
