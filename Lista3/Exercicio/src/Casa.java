public class Casa extends Moradia {

    private boolean temQuintal;

    public Casa(String tipo, int numQuartos, boolean temVagaDeGaragem, boolean temQuintal) {
        super(tipo, numQuartos, temVagaDeGaragem);
        this.temQuintal = temQuintal;
    }


    @Override

    public void exibirDadosMoradia(){
        System.out.println("Dono: " + getDono());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Número de quartos: " + getNumQuartos());
        System.out.println("Tem vaga de garagem: " + isTemVagaDeGaragem());
        System.out.println("Tem quintal: " +this.temQuintal);
        System.out.println("__________________________________");
        System.out.println(" ");

    }

    public float calculoCustosTotais() {
        return 2000.0f;
    }

}
