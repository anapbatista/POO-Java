package Lista11;

import java.util.Random;

public class Sequencial {

    public static void main(String[] args) {
        long numOperacoes = 1_000_000_000L; // exemplo com 10^9

        Random random = new Random();

        long inicio = System.currentTimeMillis();

        double resultado = 0;
        for (long i = 0; i < numOperacoes; i++) {
            double numero = random.nextDouble() * 1000 + 1; // evitar zero
            resultado += Math.sqrt(numero);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Resultado: " + resultado);
        System.out.println("Tempo sequencial: " + (fim - inicio) + " ms");
    }
}
