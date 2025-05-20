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
        lista.sort(Comparator.comparing(Produto::getDescricao));
    }

    public static void ordenarPorPreco(List<Produto> lista) {
        lista.sort(Comparator.comparingDouble(Produto::getPreco));
    }

    public static void ordenarPorPopularidade(List<Produto> lista) {
        lista.sort(Comparator.comparingInt(Produto::getPopularidade).reversed()); // mais popular primeiro
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Café", 12.5f, 85));
        produtos.add(new Produto("Leite", 4.2f, 90));
        produtos.add(new Produto("Pão", 6.0f, 70));

        System.out.println("\nOrdenado por descrição:");
        ordenarPorDescricao(produtos);
        produtos.forEach(System.out::println);

        System.out.println("\nOrdenado por preço:");
        ordenarPorPreco(produtos);
        produtos.forEach(System.out::println);

        System.out.println("\nOrdenado por popularidade:");
        ordenarPorPopularidade(produtos);
        produtos.forEach(System.out::println);
    }
}

