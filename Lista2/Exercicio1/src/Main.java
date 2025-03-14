
public class Main {
    public static void main(String[] args) {
    
        Polinomio poli = new Polinomio(4);
        Termo t0 = new Termo(4, 0);
        Termo t1 = new Termo(-2, 1);
        Termo t2 = new Termo(5, 2);
        Termo t3 = new Termo(3, 3);

        poli.Add(t0);
        poli.Add(t1);
        poli.Add(t2);
        poli.Add(t3);

        System.out.print("Polinômio: ");
        poli.Mostra();
        System.out.println();

        double resultado = poli.Calcula(2);
        System.out.println("Valor do polinômio para x = 2: " + resultado);


    }
   
}
