public class VetorR3 {
    private double[] vetor1;
    private double[] vetor2;
    @SuppressWarnings("unused")
    private Calcula op;

    public VetorR3(double[] vetor1, double[] vetor2) {
        this.vetor1 = vetor1;
        this.vetor2 = vetor2;
    }

    public double[] getVetor1() {
        return vetor1;
    }

    public void setVetor1(double[] vetor1) {
        this.vetor1 = vetor1;
    }

    public double[] getVetor2() {
        return vetor2;
    }

    public void setVetor2(double[] vetor2) {
        this.vetor2 = vetor2;
    }

    public void calcula(Calcula op){
        this.op = op;
        op.calcula(this);
    }


}
