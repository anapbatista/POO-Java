public class Main {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(3);

        pilha.empilhar(8);
        pilha.empilhar(5);
        pilha.empilhar(2);

        pilha.imprime();
        pilha.empilhar(4);

        pilha.desempilhar();
        pilha.imprime();

        pilha.desempilhar();
        pilha.desempilhar();
        pilha.imprime();

        pilha.desempilhar();

    }

}
