public class Main {
    public static void main(String[] args) {
        // Criando um sistema operacional
        DriverDispositivo[] dispositivos = new DriverDispositivo[3];
        SistemaOperacional so = new SistemaOperacional("Linux", "Ubuntu 22.04", 64, dispositivos, true );

        // Criando drivers
        DriverDeRede rede = new DriverDeRede( "Rede1", true, 1);
        DriverDeImpressao impressora = new DriverDeImpressao("Imp1", true, 1);
        DriverDeVideo video = new DriverDeVideo("Vid1", true, 1, 75);

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
        if (so.isStatus()){
            System.out.println("\nSistema operacional está funcionando corretamente.");
        }
        else{
            System.out.println("\nSistema operacional não está funcionando corretamente.");
            }

        // Realizando operações específicas
        rede.enviaPacoteDeDados(42);
        impressora.imprimePaginas(10);
        video.alteraBrilhoDeExibicao(45);

        // Desligando o sistema
        System.out.println("\nDesligando o SO...");
        so.desligaSO();
    }
}
