package Exercicios.src;

import java.util.*;

public class Produto {
    private String descricao;
    private float preco;
    private int popularidade;

    public Produto(String descricao, float preco, int popularidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.popularidade = popularidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public int getPopularidade() {
        return popularidade;
    }

    @Override
    public String toString() {
        return descricao + " - R$" + preco + " - Pop: " + popularidade;
    }

    public static void ordenarPorDescricao(List<Produto> lista) {
        Comparator<Produto> comparadorPorDescricao = new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                // Comparando de forma decrescente (mais popular primeiro)
                return p1.getDescricao().compareTo(p2.getDescricao());
            }
        };

        lista.sort(comparadorPorDescricao);
    }

    public static void ordenarPorPreco(List<Produto> lista) {
        Comparator<Produto> comparadorPorPreco = new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                // Comparando de forma decrescente (mais popular primeiro)
                return Float.compare(p2.getPreco(), p1.getPreco());
            }
        };

        lista.sort(comparadorPorPreco);
    }

    public static void ordenarPorPopularidade(List<Produto> lista) {
        Comparator<Produto> comparadorPorPopularidade = new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                // Comparando de forma decrescente (mais popular primeiro)
                return Integer.compare(p2.getPopularidade(), p1.getPopularidade());
            }
        };

        lista.sort(comparadorPorPopularidade);
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Café", 12.5f, 85));
        produtos.add(new Produto("Leite", 4.2f, 90));
        produtos.add(new Produto("Pão", 6.0f, 70));

        System.out.println("\nOrdenado por descrição:");
        ordenarPorDescricao(produtos);
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\nOrdenado por preço:");
        ordenarPorPreco(produtos);
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\nOrdenado por popularidade:");
        ordenarPorPopularidade(produtos);
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
