public class Main {
    public static void main(String[] args) {

        double[] v1 = {1.0, 2.0, 7.0};
        double[] v2 = {8.0, 4.0, 9.0};

        VetorR3 vetor = new VetorR3(v1, v2);

        Calcula soma = (Calcula) new Soma();
        Calcula produtoEsc = new ProdutoEscalar();
        Calcula produtoVet = new ProdutoVetorial();


        vetor.calcula(soma);
        vetor.calcula(produtoEsc);
        vetor.calcula(produtoVet);

        
    }

}
