public class PilhaGenerica<T> {

    private int topo;
    private int tamanho;
    private T[] pilha;


    public PilhaGenerica(int tamanho) {
        this.tamanho = tamanho;
        this.topo = -1;
        this.pilha = (T[]) new Object[tamanho];
    }

    // verifica se a pilha ta vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // verifica se a pilha ta cheia
    public boolean isFull() {
        return (topo == tamanho - 1); // valor max
    }

    // inserir na pilha
    public void push(T elemento) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
            return;
        }
        pilha[++topo] = elemento;

    }

    // remover da pilha
    public T pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        return pilha[topo--];
    }

    public void imprimir() {
        System.out.print("Pilha (topo -> base): ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        return pilha[topo];
    }

    public static void main(String[] args) {
        PilhaGenerica<Integer> pilha1 = new PilhaGenerica<>(10);

        pilha1.push(10);
        pilha1.push(20);
        pilha1.push(30);

        pilha1.imprimir(); // Deve mostrar: 30 20 10

        System.out.println("Topo: " + pilha1.peek()); // 30

        System.out.println("Pop: " + pilha1.pop()); // 30

        pilha1.imprimir(); // 20 10
        System.out.println("\n");

        PilhaGenerica<String> pilha2 = new PilhaGenerica<>(5);
        pilha2.push("Maça");
        pilha2.push("Banana");
        pilha2.push("Laranja");

        pilha2.imprimir(); // Laranja Banana Maça

        System.out.println("Topo: " + pilha2.peek()); // Laranja

        System.out.println("Pop: " + pilha2.pop()); // Laranja

        pilha2.imprimir(); // Banana Maça
    }

}
