public class ProcessadorMultiploDe2 extends Processador {

    public ProcessadorMultiploDe2(Processador prox){
        super(prox);
    }

    @Override
    public void processar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Múltiplo de 2 -> Número: " + numero);
            System.out.println("  Quadrado: " + (numero * numero));
            System.out.println("  Raiz Quadrada: " + Math.sqrt(numero));
        } else if (proximoProcessador != null) {
            proximoProcessador.processar(numero);
        }
    }
}
