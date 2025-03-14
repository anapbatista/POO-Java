public class Processador {
    private int frequencia; // Em MHz

    public Processador(int frequencia) {
        this.frequencia = frequencia;
    }

    public void executarAplicativo(String nomeApp) {
        System.out.println("Executando o aplicativo: " + nomeApp);
        System.out.println("Frequencia em: "+ getFrequencia());
        gerenciarConsumoEnergia();
    }

    private void gerenciarConsumoEnergia() {
        System.out.println("Gerenciando o consumo de energia do processador...");
    }

    public int getFrequencia(){
        return this.frequencia;
    }

}
