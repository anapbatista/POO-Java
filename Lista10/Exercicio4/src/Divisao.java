public class Divisao implements Operacao{
    @Override
    public double calcular(double num1, double num2) {
        if (num2==0){
            System.out.println("Divisão por zero não permitida");
            return -1;
        }else{
        return num1/num2;}
    }

}
