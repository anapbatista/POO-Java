public class ProcessadorDefault extends Processador {

    public ProcessadorDefault(Processador prox){
        super(prox);
    }

    @Override
    public void processar(int numero) {
        System.out.println("Não é múltiplo de 2 nem de 3 -> Número: " + numero);
        System.out.println("  Quadrado: " + (numero * numero));
        System.out.println("  Raiz Quadrada: " + Math.sqrt(numero));
    }
}
