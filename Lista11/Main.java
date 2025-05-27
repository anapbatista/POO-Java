package Lista11;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stack<Integer> pilha = new Stack<>();

        Produtor2 produtor = new Produtor2(pilha, 10);
        Consumidor2 c1 = new Consumidor2(pilha, "c1");
        Consumidor2 c2 = new Consumidor2(pilha, "c2");
        Consumidor2 c3 = new Consumidor2(pilha, "c3");

        Thread t1 = new Thread(produtor);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c2);
        Thread t4 = new Thread(c3);

        t1.start();
        t1.join();

        t2.start();
        t3.start();
        t4.start();
        t2.join();
        t3.join();
        t4.join();

        Consumidor2 vencedor = c1;
        if (c2.getContador() > vencedor.getContador()) vencedor = c2;
        if (c3.getContador() > vencedor.getContador()) vencedor = c3;

        System.out.println("\n" + vencedor.getNome() + " foi quem mais consumiu: " + vencedor.getContador() + " itens.");


        System.out.println("\nTodos os itens foram consumidos. Programa encerrado.");
    }
}
