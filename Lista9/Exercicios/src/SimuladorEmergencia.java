package Exercicios.src;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimuladorEmergencia {
    private Deque<Chamado> filaChamados;

    public SimuladorEmergencia() {
        filaChamados = new ArrayDeque<>();
    }

    public void adicionarChamado(Chamado chamado) {
        if (chamado.isCritico()) {
            filaChamados.push(chamado); // Insere no início
            System.out.println("Chamado CRÍTICO adicionado ao início da fila.");
        } else {
            filaChamados.add(chamado); // Insere no fim
            System.out.println("Chamado COMUM adicionado ao fim da fila.");
        }
    }

    public void atenderChamado() {
        if (filaChamados.isEmpty()) {
            System.out.println("Nenhum chamado na fila.");
        } else {
            Chamado chamadoAtendido = filaChamados.remove(); // Remove do início
            System.out.println("Atendendo chamado: " + chamadoAtendido);
        }
    }

    public void listarFila() {
        if (filaChamados.isEmpty()) {
            System.out.println("Fila de chamados vazia.");
        } else {
            System.out.println("\nFila de atendimento:");
            for (Chamado c : filaChamados) {
                System.out.println("- " + c);
            }
        }
    }

    public static void main(String[] args) {
        SimuladorEmergencia sistema = new SimuladorEmergencia();

        sistema.adicionarChamado(new Chamado("Pessoa desmaiada na rua", true));
        sistema.adicionarChamado(new Chamado("Gato preso na árvore", false));
        sistema.adicionarChamado(new Chamado("Acidente de trânsito com feridos", true));
        sistema.adicionarChamado(new Chamado("Vazamento de água em residência", false));

        sistema.listarFila();

        System.out.println("\n--- Iniciando atendimentos ---");
        sistema.atenderChamado();
        sistema.atenderChamado();

        sistema.listarFila();
    }
}
