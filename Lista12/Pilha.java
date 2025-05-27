package Lista12;

public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1; // pilha vazia
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == elementos.length - 1;
    }

    public void push(int valor) throws PilhaCheiaException {
        if (estaCheia()) {
            throw new PilhaCheiaException("Erro: Pilha está cheia.");
        }
        topo++;
        elementos[topo] = valor;
        System.out.println("Empilhou: " + valor);
    }

    public int pop() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException("Erro: Pilha está vazia.");
        }
        int valor = elementos[topo];
        topo--;
        System.out.println("Desempilhou: " + valor);
        return valor;
    }

    
}

