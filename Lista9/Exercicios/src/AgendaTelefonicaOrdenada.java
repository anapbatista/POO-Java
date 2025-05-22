package Exercicios.src;

import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonicaOrdenada {


    private TreeMap<String, Long> contatos;

    public AgendaTelefonicaOrdenada() {
        contatos = new TreeMap<>();
    }

    // Adiciona um novo contato
    public void adicionarContato(String nome, Long telefone) {
        contatos.put(nome, telefone);
        System.out.println("Contato adicionado: " + nome);
    }

    // Busca um número de telefone pelo nome
    public void buscarContato(String nome) {
        Long telefone = contatos.get(nome);
        if (telefone != null) {
            System.out.println("Telefone de " + nome + ": " + telefone + "\n");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Lista todos os contatos em ordem alfabética
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }

        System.out.println("\nContatos (ordem alfabética):\n");
        for (Map.Entry<String, Long> entry : contatos.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Método principal para testes
    public static void main(String[] args) {
        AgendaTelefonicaOrdenada agenda = new AgendaTelefonicaOrdenada();
        

        agenda.adicionarContato("Carlos", 99887766L);
        agenda.adicionarContato("Ana", 11112222L);
        agenda.adicionarContato("Bruno", 33334444L);

        agenda.listarContatos();  // Deve listar Ana, Bruno, Carlos em ordem

        System.out.print("\nBuscar contato: \n");
        agenda.buscarContato("Ana");  // Deve mostrar o telefone de Ana

        
    }


}
