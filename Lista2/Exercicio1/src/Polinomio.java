package Lista2.Exercicio1.src;

public class Polinomio {

    private Termo[] termos;
    int grauPolinomio;

    public Polinomio(int UmgrauPolinomio) {
        grauPolinomio = UmgrauPolinomio;
        this.termos = new Termo[grauPolinomio];
    }

    public boolean Add(Termo aTermo) {
        if (aTermo.getGrau() > grauPolinomio) {
            return false;
        }
        for (int i = 0; i < grauPolinomio; i++) {

            if (termos[i] == null) {
                termos[i] = aTermo;

            }
            if (termos[i].getGrau() == aTermo.getGrau()) {
                termos[i].setCoeficiente(termos[i].getCoeficiente() +
                        aTermo.getCoeficiente());

            }

        }
        return true;
    }

    public void Mostra() {
        for (int i = 0; i < grauPolinomio; i++)
            System.out.print(termos[i].getCoeficiente() + "x^" + termos[i].getGrau() + " + ");
    }

    public double Calcula(double aX){
        double resultado = 0;
        for (int i = 0; i < grauPolinomio; i++)
        resultado += termos[i].getCoeficiente() * Math.pow(aX, termos[i].getGrau());
        return resultado;

    }

}