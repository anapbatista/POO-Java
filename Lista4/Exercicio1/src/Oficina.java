

public class Oficina {

    private Veiculo[] veiculos;
    private int indiceAtual;
    

    public Oficina() {
        veiculos = new Veiculo[]{new Bicicleta(), new Automovel(), new Bicicleta(), new Automovel()};
        indiceAtual = 0;
        
    }

    public Veiculo proximo() {
        if (indiceAtual >= veiculos.length) {
            indiceAtual = 0; // Reinicia a contagem se ultrapassar o array
        }
        return veiculos[indiceAtual++];
    }

    public void manutencao(Veiculo v) {
        System.out.println("\nIniciando manutenção do veículo...");
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();

        if (v instanceof Automovel) {
            Automovel a = ((Automovel) v);
            a.trocarOleo();

        }
    }
}


