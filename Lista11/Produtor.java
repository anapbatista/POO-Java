package Lista11;

import java.util.Stack;

public class Produtor implements Runnable {
    private Stack<Integer> pilha;

    public Produtor(Stack<Integer> pilha) {
        this.pilha = pilha;
    }

    public void empilha(int i) {
        synchronized (pilha) {

            while (this.pilha.size() >= 10) {
                try {
                    System.out.println("Pilha cheia. Produtor esperando...");
                    pilha.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            this.pilha.push(i);
            System.out.println("Produtor empilhou " + i);
            pilha.notify();
        }
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            empilha(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }

    }

}
