public class Pessoa {

    private String nome;
    private int idade;
    private char sexo; //"F" ou "M"

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public boolean fezAniversario(){
        setIdade(++idade);
        return true;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("_________________");
        System.out.println(" ");
        }
    }

    

    

