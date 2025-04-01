public class Predio {

    private String nomePredio;
    private Apartamento[] aptos;

    private static final int MIN = 2; 
    private static final int MAX = 10;

    public Predio(String nomePredio, int numAptos) {
        this.nomePredio = nomePredio;

        if (numAptos >= MIN && numAptos <= MAX) {  // Verificando se o número de apartamentos está dentro do limite
            this.aptos = new Apartamento[numAptos];
        } else {
            System.out.println("O número de apartamentos deve estar entre " + MIN + " e " + MAX);
        }
    }

    public String getNomePredio() {
        return nomePredio;
    }

    public void setNomePredio(String nomePredio) {
        this.nomePredio = nomePredio;
    }

    public Apartamento[] getPredio() {
        return aptos;
    }

    public boolean setMoradorDeAp(int numDoAp, Pessoa pMorador) {
        if (numDoAp >= MIN && numDoAp <= aptos.length) {  // Verificando se o número do apartamento está no intervalo correto
            aptos[numDoAp - 1].setMorador(pMorador);  // Atribuindo o morador ao apartamento
            return true;
        } else {
            System.out.println("O número do apartamento deve estar entre " + MIN + " e " + aptos.length);
            return false;
        }
    }
}
