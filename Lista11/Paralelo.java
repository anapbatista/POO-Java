package Lista11;

import java.util.Random;

public class Paralelo {

    static class Worker extends Thread {
        private long qtdOperacoes;
        private double resultado = 0;

        public Worker(long qtdOperacoes) {
            this.qtdOperacoes = qtdOperacoes;
        }

        public double getResultado() {
            return resultado;
        }

        @Override
        public void run() {
            Random random = new Random(); // thread-safe aqui porque cada thread cria o seu

            for (long i = 0; i < qtdOperacoes; i++) {
                double numero = random.nextDouble() * 1000 + 1;
                resultado += Math.sqrt(numero);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long numOperacoes = 1_000_000_000L; // exemplo com 10^9

        int nCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Número de núcleos: " + nCores);

        Worker[] workers = new Worker[nCores];

        long operacoesPorThread = numOperacoes / nCores;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < nCores; i++) {
            workers[i] = new Worker(operacoesPorThread);
            workers[i].start();
        }

        for (Worker w : workers) {
            w.join();
        }

        double resultado = 0;
        for (Worker w : workers) {
            resultado += w.getResultado();
        }

        long fim = System.currentTimeMillis();

        System.out.println("Resultado: " + resultado);
        System.out.println("Tempo paralelo: " + (fim - inicio) + " ms");
    }
}
