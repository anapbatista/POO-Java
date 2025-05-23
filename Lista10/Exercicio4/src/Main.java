public class Main {
        public static void main(String[] args) {

            try {
                double soma = CalculadoraFacade.calcular("+",2.0, 5.0);
                System.out.println("Soma: " + soma +"\n");
                double multiplicacao = CalculadoraFacade.calcularExpressao("4.0 * 6.0");
                System.out.println("Multiplicação: " + multiplicacao +"\n");
                double divisao = CalculadoraFacade.calcularExpressao("4.0 / 0.0");
                System.out.println("Divisão: " + divisao +"\n");
                double sub = CalculadoraFacade.calcular("-",2.0, 5.0);
                System.out.println("Subtração: " + sub +"\n");




            } catch (Exception e) {
                e.printStackTrace();
            }



        }

}
