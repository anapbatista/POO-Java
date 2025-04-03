public class Gerente extends Funcionario {

    public Gerente(String aNome, double aSalario){
        super(aNome, aSalario);
    }

    public double calcularSalario(){
        return super.calcularSalario() + 2000;
    }

}
