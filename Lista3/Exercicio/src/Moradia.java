public abstract class Moradia {

    private String tipo; // Casa ou Apto
    private int numQuartos;
    private boolean temVagaDeGaragem;
    private Pessoa dono;

    public Moradia(String tipo, int numQuartos, boolean temVagaDeGaragem) {
        this.tipo = tipo;
        this.numQuartos = numQuartos;
        this.temVagaDeGaragem = temVagaDeGaragem;
    }

    public boolean isTemVagaDeGaragem() {
        return temVagaDeGaragem;
    }



    public String getTipo() {
        return tipo;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public String getDono() {
        return dono.getNome();
    }

    public void setMorador(Pessoa aPessoa) {
        {
            this.dono = aPessoa;
        }

    }

    // métodos de implementação concreta

    public void exibirDadosMoradia() {
        System.out.println("Dono: " + this.dono.getNome());
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Número de quartos: " + this.numQuartos);
        System.out.println("Tem vaga de garagem: " + this.temVagaDeGaragem);
        System.out.println("__________________________________");
        System.out.println(" ");

    }


    public void comprarVagaDeGaragem() {
        if (!isTemVagaDeGaragem()) {
            this.temVagaDeGaragem = true;
            System.out.println("Vaga de garagem comprada com sucesso!");
            
        } else {
            System.out.println("Já tem vaga de garagem!");
        }
        System.out.println(" ");
    }

    public abstract float calculoCustosTotais(); //implementação abstrata - deve ser feita obrigatoriamente nas subclasses 

}
