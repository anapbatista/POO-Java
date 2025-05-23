public class ProcessadorMultiploDe3 extends Processador {

    public ProcessadorMultiploDe3(Processador prox){
        super(prox);
    }

    @Override
    public void processar(int numero) {
        if (numero % 3 == 0) {
            System.out.println("Múltiplo de 3 -> Número: " + numero);
            System.out.println("  Quadrado: " + (numero * numero));
            System.out.println("  Raiz Quadrada: " + Math.sqrt(numero));
        } else if (proximoProcessador != null) {
            proximoProcessador.processar(numero);
        }
    }
}
