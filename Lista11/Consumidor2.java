package Lista11;

import java.util.Stack;

public class Consumidor2 implements Runnable {
    private Stack<Integer> pilha;
    private String nome;
    private int contador = 0;

    public Consumidor2(Stack<Integer> pilha, String nome) {
        this.pilha = pilha;
        this.nome = nome;
    }

    @Override
    public void run() {
        synchronized (pilha) {
            try {
                // Espera até que o produtor termine (ou seja, até que a pilha tenha itens)
                while (pilha.isEmpty()) {
                    System.out.println(nome + " esperando o produtor terminar...");
                    pilha.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Após o produtor terminar, os consumidores começam a consumir
        while (true) {
            synchronized (pilha) {
                if (pilha.isEmpty()) {
                    System.out.println(nome + " terminou. Não há mais itens.");
                    break; // Encerra quando a pilha está vazia
                }

                int valor = pilha.pop();
                contador++;
                System.out.println("Consumidor " + nome + " desempilhou " + valor);
            }

            try {
                Thread.sleep(300); // Simula tempo de consumo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getContador() {
        return contador;
    }

    public String getNome() {
        return nome;
    }
}
