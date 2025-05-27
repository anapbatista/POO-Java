package Lista11;

import java.util.Stack;

public class Produtor2 implements Runnable {
    private Stack<Integer> pilha;
    private int quantidade;

    public Produtor2(Stack<Integer> pilha, int quantidade) {
        this.pilha = pilha;
        this.quantidade = quantidade;
    }

    @Override
    public void run() {
        synchronized (pilha) {
            for (int i = 1; i <= quantidade; i++) {
                pilha.push(i);
                System.out.println("Produtor empilhou " + i);
            }
            System.out.println("Produtor terminou.");
            pilha.notifyAll(); // Avisa todos os consumidores que podem conferir se a pilha acabou
        }
    }
}
