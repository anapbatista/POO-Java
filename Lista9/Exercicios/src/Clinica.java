package Exercicios.src;
import java.util.LinkedList;
import java.util.Queue;


public class Clinica {

    private Queue<String> filaPacientes;

    public Clinica() {
        filaPacientes = new LinkedList<>();
    }

    // Adicionar paciente no fim da fila
    public void adicionarPaciente(String nome) {
        filaPacientes.add(nome);
        System.out.println("Paciente " + nome + " adicionado à fila.");
    }

    // Atender paciente (remover do início da fila)
    public void atenderPaciente() {
        if (filaPacientes.isEmpty()) {
            System.out.println("Nenhum paciente na fila para atendimento.");
        } else {
            String paciente = filaPacientes.poll();
            System.out.println("Paciente chamado para atendimento: " + paciente);
        }
    }

    // Cancelar atendimento (remover paciente arbitrário)
    public void cancelarAtendimento(String nome) {
        if (filaPacientes.remove(nome)) {
            System.out.println("Paciente " + nome + " cancelou o atendimento.");
        } else {
            System.out.println("Paciente " + nome + " não encontrado na fila.");
        }
    }

    // Listar pacientes na fila
    public void listarPacientes() {
        if (filaPacientes.isEmpty()) {
            System.out.println("Nenhum paciente aguardando.");
        } else {
            System.out.println("Pacientes na fila:");
            int pos = 1;
            for (String paciente : filaPacientes) {
                System.out.println(pos + ". " + paciente);
                pos++;
            }
        }
    }

    // Método principal para teste
    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        clinica.adicionarPaciente("Ana");
        clinica.adicionarPaciente("Bruno");
        clinica.adicionarPaciente("Carlos");
        clinica.adicionarPaciente("Diana");

        clinica.listarPacientes();

        clinica.atenderPaciente();

        clinica.listarPacientes();

        clinica.cancelarAtendimento("Carlos");

        clinica.listarPacientes();

        clinica.atenderPaciente();
        clinica.atenderPaciente();
        clinica.atenderPaciente();
    }
}
