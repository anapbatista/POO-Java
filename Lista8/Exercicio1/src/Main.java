public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta Bic", 10.56);
        Produto p2 = new Produto("Lápis FaberCastell", 2.50);

        ClasseT<Produto> classe = new ClasseT<>(p1, p2);
        System.out.println("Produtos:");
        System.out.println(classe);
        System.out.println("\nProduto mais caro: " + classe.getMax());


    }

}
