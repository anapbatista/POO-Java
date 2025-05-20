public class ArvoreBinariaBusca<T extends Comparable<T>> {

    private class No {
        T valor;
        No esquerda;
        No direita;

        No(T valor) {
            this.valor = valor;
        }
    }

    private No raiz;

    // inserção
    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, T valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor.compareTo(atual.valor) < 0) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor.compareTo(atual.valor) > 0) {
            atual.direita = inserirRec(atual.direita, valor);
        }
        return atual;
    }

    // Método de busca
    public boolean buscar(T valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(No atual, T valor) {
        if (atual == null)
            return false;
        if (valor.compareTo(atual.valor) == 0)
            return true;
        if (valor.compareTo(atual.valor) < 0)
            return buscarRec(atual.esquerda, valor);
        return buscarRec(atual.direita, valor);
    }

    // Impressão em ordem
    public void emOrdem() {
        emOrdemRec(raiz);
        System.out.println();
    }

    private void emOrdemRec(No atual) {
        if (atual != null) {
            emOrdemRec(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdemRec(atual.direita);
        }
    }

    public static void main(String[] args) {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();

        int[] valores = {50, 30, 20, 40, 70, 60, 80};

        for (int v : valores) {
            arvore.inserir(v);
        }

        System.out.println("Impressão em ordem:");
        arvore.emOrdem(); // Deve imprimir os valores em ordem crescente

        System.out.println("Busca por 40: " + arvore.buscar(40)); // true
        System.out.println("Busca por 90: " + arvore.buscar(90)); // false
    }

}
