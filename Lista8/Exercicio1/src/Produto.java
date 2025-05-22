public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto( String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }


    public int getid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getid'");
    }

}
