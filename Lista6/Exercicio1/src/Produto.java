public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida) {
        if (quantidade >= quantidadeVendida) {
            this.quantidade -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso!\n");
        } else {
            System.out.println("Quantidade insuficiente!\n");
        }
    }

    public void repor(int quantidadeReposta){
        this.quantidade += quantidadeReposta;   
        System.out.println("Reposição realizada com sucesso!\n");
    }

    public String tostring(){
        return "ID: " + id + "\nNome: " + nome + "\nPreço: "+
        String.format("%.2f", preco) + "\nQuantidade: " + quantidade;

    }

    

}
