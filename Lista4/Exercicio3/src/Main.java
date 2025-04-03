public class Main {
    public static void main(String[] args) {

        Funcionario[] vetor = new Funcionario[3];

        Estagiario est = new Estagiario("Ana", 1500);
        Gerente ger = new Gerente("João", 3000);
        Vendedor ven = new Vendedor("Vitor", 2000, 50, 6.75);
        vetor[0] = est;
        vetor[1]=ger;
        vetor[2]=ven;

        for (int i=0; i<vetor.length; i++){
            System.out.println("Classe: " + vetor[i].getClass().getSimpleName() + 
                       " | Funcionário: " + vetor[i].getNome() + 
                       " | Salário: " + vetor[i].calcularSalario());
        }



    }
}
