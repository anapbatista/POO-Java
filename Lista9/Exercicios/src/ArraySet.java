package Exercicios.src;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraySet <E extends Comparable<E>> extends ArrayList<E> {

    private TreeSet<E> conjuntoOrdenado = new TreeSet<>();

    @Override
    public boolean add(E elemento) {
        if (conjuntoOrdenado.add(elemento)) {
            return super.add(elemento); // adiciona só se não é duplicado
        }
        return false; // não adiciona se já existe
    }

    @Override
    public boolean remove(Object o) {
        if (conjuntoOrdenado.remove(o)) {
            return super.remove(o); // remove dos dois se existir
        }
        return false; // não existia
    }

    @Override
    public void clear() {
        super.clear();
        conjuntoOrdenado.clear();
    }

    // Método auxiliar: retorna os elementos em ordem
    public void listarOrdenado() {
        System.out.println("Elementos em ordem:");
        for (E elemento : conjuntoOrdenado) {
            System.out.println("- " + elemento);
        }
    }

    public static void main(String[] args) {
        ArraySet<String> nomes = new ArraySet<>();

        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Ana"); // Duplicado - será ignorado
        nomes.add("Bruno");

        System.out.println("Conteúdo da lista (inserção): " + nomes);

        nomes.listarOrdenado(); // Exibe em ordem alfabética

        nomes.remove("Carlos");
        System.out.println("\nApós remoção:");
        nomes.listarOrdenado();
    }
}
