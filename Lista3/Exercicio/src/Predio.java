import java.util.Scanner;


public class Predio {

    private String nomePredio;
    private Apartamento[] aptos;

    private static final int MIN = 2; 
    private static final int MAX = 10;

    public Predio(String nomePredio, int numAptos) {
        Scanner scanner = new Scanner(System.in);
        this.nomePredio = nomePredio;

        if (numAptos >= MIN && numAptos <= MAX) {  // Verificando se o número de apartamentos está dentro do limite
            this.aptos = new Apartamento[numAptos];

            for (int i = 0; i < numAptos; i++) {
                
                System.out.println("\nInforme os dados do Apartamento " + (i + 1) + ":");

                System.out.print("Número de quartos: ");
                int numQuartos = scanner.nextInt();

                System.out.print("O apartamento tem vaga de garagem? (true/false): ");
                boolean temVagaDeGaragem = scanner.nextBoolean();

                System.out.print("Andar do apartamento: ");
                int andar = scanner.nextInt();

                this.aptos[i] = new Apartamento("Apto" , numQuartos, temVagaDeGaragem, andar);
                System.out.println(" ");
            }
        } else {
            System.out.println("O número de apartamentos deve estar entre " + MIN + " e " + MAX);
        }
        scanner.close();

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
