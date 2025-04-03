public class NumeroComplexo {

    private double real;
    private double imaginario;

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginario() {
        return imaginario;
    }
    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double modulo(){
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginario,
        2));
    }
    public String toString() {
        return real + (imaginario >= 0 ? " + " : " - ") + Math.abs(imaginario) + "i";
    }
    

    public NumeroComplexo adicionar(NumeroComplexo a){
        NumeroComplexo b = new NumeroComplexo(real + a.getReal(), imaginario + a.getImaginario());
        return b;

    }

    public NumeroComplexo multiplicar(NumeroComplexo a) {
        double novoReal = (real * a.getReal()) - (imaginario * a.getImaginario());
        double novoImaginario = (real * a.getImaginario()) + (imaginario * a.getReal());
        return new NumeroComplexo(novoReal, novoImaginario);
    }
    

    

}
