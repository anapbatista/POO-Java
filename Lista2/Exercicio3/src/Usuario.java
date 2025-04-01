public class Usuario {
    private String nome;
    private int idade;
    private String CPF;

    public Usuario(String nome, int idade, String cPF) {
        this.nome = nome;
        this.idade = idade;
        CPF = cPF;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

}
