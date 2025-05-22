import java.util.*;

public class Pilha<T> {

    private int tamanho;
    private Deque<T> elementos;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        elementos = new LinkedList<>();

    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public boolean estaCheia() {
        return elementos.size() == tamanho;
    }

    public void empilhar(T elem) {
        if (this.estaCheia()) {
            System.out.println("A pilha está cheia.\n");
        } else {
            elementos.push(elem);
        }
    }

    public T desempilhar() {
        if (this.estaVazia()) {
            System.out.println("A pilha está vazia.\n");

        } else {
            return elementos.pop();
        }
        return null;
    }

    public void imprime(){
        System.out.println(elementos);
    }

}
