package Lista12;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3); // pilha com capacidade 3

        try {
            // Tentando empilhar elementos
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);
            // Forçando pilha cheia
            pilha.push(40); 
        } catch (PilhaCheiaException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Desempilhando todos os elementos
            pilha.pop();
            pilha.pop();
            pilha.pop();
            // Forçando pilha vazia
            pilha.pop(); 
        } catch (PilhaVaziaException e) {
            System.out.println(e.getMessage());
        }
    }
}
