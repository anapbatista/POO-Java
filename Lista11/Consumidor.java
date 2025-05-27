package Lista11;

import java.util.Stack;

public class Consumidor implements Runnable {
    private Stack<Integer> pilha;

    public Consumidor(Stack<Integer> pilha) {
        this.pilha = pilha;
    }

    public int desempilha() {
        synchronized (pilha) {
            while (this.pilha.isEmpty()) {
                try {
                    System.out.println("Pilha vazia. Consumidor esperando...");
                    pilha.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int valor = this.pilha.pop();
            System.out.println("Consumidor desempilhou " + valor);
            pilha.notify(); // Avisa que há espaço na pilha
            return valor;
        }
    }

    @Override
    public void run() {
        while (true) {
            desempilha();

            try {
                Thread.sleep(1000); // Simula tempo de consumo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
