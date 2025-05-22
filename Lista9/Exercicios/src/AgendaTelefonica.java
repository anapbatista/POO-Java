package Exercicios.src;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {

    private Map<String, Long> contatos;

    public AgendaTelefonica() {
        contatos = new HashMap<>();
    }

    // Adiciona ou atualiza um contato
    public void adicionarContato(String nome, Long telefone) {
        contatos.put(nome, telefone);
        System.out.println("Contato " + nome + " adicionado/atualizado com sucesso.");
    }

    // Busca número de telefone pelo nome
    public void buscarTelefone(String nome) {
        if (contatos.containsKey(nome)) {
            System.out.println("Telefone de " + nome + ": " + contatos.get(nome));
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Lista todos os contatos
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            System.out.println("Contatos na agenda:");
            for (Map.Entry<String, Long> entry : contatos.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    // Testando a agenda
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        
        agenda.adicionarContato("Ana", 123456789L);
        agenda.adicionarContato("João", 987654321L);
        agenda.adicionarContato("Maria", 111111111L);

        agenda.listarContatos();


        agenda.buscarTelefone("João");

    }
}
