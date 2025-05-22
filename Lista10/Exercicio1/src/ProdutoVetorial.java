public class ProdutoVetorial implements Calcula {

    public void calcula(VetorR3 v) {
        double[] v1 = v.getVetor1();
        double[] v2 = v.getVetor2();
        double[] v3 = new double[3];

        v3[0] = v1[1] * v2[2] - v1[2] * v2[1];
        v3[1] = v1[2] * v2[0] - v1[0] * v2[2];
        v3[2] = v1[0] * v2[1] - v1[1] * v2[0];

        System.out.println("Produto vetorial: (" + v3[0] + ", " + v3[1] + ", " + v3[2] + ")");
    }
}
