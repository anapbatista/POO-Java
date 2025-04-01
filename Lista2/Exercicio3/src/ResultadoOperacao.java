public class ResultadoOperacao {

    private Usuario user;
    private int dia;
    private int mes;
    private int ano;
    private String tipo;
    private float resultado;


    public ResultadoOperacao(Usuario user, int dia, int mes, int ano, String tipo, float resultado) {
        this.user = user;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.tipo = tipo;
        this.resultado = resultado;
    }

    public void exibirResultado() {
        System.out.println("Usuário: " + user.getNome());
        System.out.println("Operação: " + tipo);
        System.out.println("Resultado: " + resultado);
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }

    

}
