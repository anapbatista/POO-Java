public class Apartamento extends Moradia {

    private int andar;

    public Apartamento(String tipo, int numQuartos, boolean temVagaDeGaragem, int andar) {
        super(tipo, numQuartos, temVagaDeGaragem);
        this.andar = andar;

    }

    public void exibirDadosMoradia(){ //polimorfismo 
        System.out.println("Morador " + getDono().getNome() + " mora em " + getTipo() + " no andar " + andar + ". Com " + getNumQuartos() + " quartos.");
        System.out.println("Tem vaga de garagem: "+ isTemVagaDeGaragem());
        System.out.println(" ");

    }

    
    public float calculoCustosTotais() {
        return 1000.0f;
    }

    

    

}
