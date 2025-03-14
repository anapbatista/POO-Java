package Lista2.Exercicio1.src;

public class Termo {

    private int coeficiente;
    private int expoente;

    public Termo(int aCoeficiente, int aExpoente) {
        this.coeficiente = aCoeficiente;
        this.expoente = aExpoente;

    }

    public int getGrau() {
        return expoente;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int umCoeficiente){
        this.coeficiente = umCoeficiente;
    }

}
