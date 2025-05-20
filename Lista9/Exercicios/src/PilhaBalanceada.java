package Exercicios.src;
import java.util.Deque;
import java.util.LinkedList;

public class PilhaBalanceada {

    public boolean estaBalanceada(String expressao) {

        Deque<Character> pilha = new LinkedList<>(); // pilha criada dentro do método

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c); // empilha parêntese de abertura
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    // tentativa de desempilhar sem elemento correspondente
                    return false;
                }
                pilha.pop(); // desempilha parêntese de abertura correspondente
            }
        }

        // Se pilha está vazia, todos os parênteses foram balanceados
        return pilha.isEmpty();
    }


    public static void main(String[] args) {
        String[] expressoes = {
            "(a + b) * (c - d)",       // balanceada
            "((1 + 2) * 3)",           // balanceada
            "(a + b * (c - d)",        // não balanceada
            ")",                       // não balanceada
            "((()))",                  // balanceada
            "",                        // balanceada (sem parênteses)
            "(())())",                 // não balanceada
            "((a + b) * ((c + d)))"    // balanceada
        };

        PilhaBalanceada pilha = new PilhaBalanceada();


        for (String exp : expressoes) {
            System.out.println("Expressão: \"" + exp + "\" está " +
                (pilha.estaBalanceada(exp) ? "balanceada ✅" : "desbalanceada ❌"));
        }
    }

}
