public class Automovel extends Veiculo{

    
    @Override
    public void ajustar() {
        System.out.println("Ajustando o volante e o banco do motorista");
    }

    @Override
    public void limpar() {
        System.out.println("Limpando o automóvel");
    }

    @Override
    public void listarVerificacoes() {
        System.out.println("Verificando o óleo, o freio e o pneu");
    }

    public void trocarOleo(){
        System.out.println("Trocando o óleo do automóvel");
    }

    

}
