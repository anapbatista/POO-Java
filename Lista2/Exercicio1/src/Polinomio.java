
public class Polinomio {

    private Termo[] termos;
    int grauPolinomio;

    public Polinomio(int UmgrauPolinomio) {
        grauPolinomio = UmgrauPolinomio;
        this.termos = new Termo[grauPolinomio+1];
    }

    public boolean Add(Termo aTermo) {
        if (aTermo.getGrau() > grauPolinomio) {
            return false;  
        }

        
        for (int i = 0; i <= grauPolinomio; i++) {
            if (termos[i] == null) {
                termos[i] = aTermo;
                return true; 
            }

            if (termos[i].getGrau() == aTermo.getGrau()) {
                termos[i].setCoeficiente(termos[i].getCoeficiente() + aTermo.getCoeficiente());
                return true; 
            }
        }

        return false;
    }

    public void Mostra() {
        for (int i = 0; i <= grauPolinomio; i++) {
            if (termos[i] != null) {
                System.out.print(termos[i].getCoeficiente() + "x^" + termos[i].getGrau());
                if (i < grauPolinomio && termos[i + 1] != null) {
                    System.out.print(" + ");
                }
            }
        }
    }

    public double Calcula(double aX) {
        double resultado = 0;
        for (int i = 0; i <= grauPolinomio; i++) {
            if (termos[i] != null) {
                resultado += termos[i].getCoeficiente() * Math.pow(aX, termos[i].getGrau());
            }
        }
        return resultado;
    }

}