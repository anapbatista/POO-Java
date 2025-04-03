public class Main {
    public static void main(String[] args) {
        Produto[] carrinho =new Produto[4];
        carrinho[0]=new Mouse("Mouse óptico, Saída USB, 1.600 dpi", "Óptico");
        carrinho[1]=new Mouse("Mouse sem fio, conexão Bluetooth", "Sem fio");
        carrinho[2]= new Livro("Livro de programação Java", "Autor A");
        carrinho[3]= new Livro("Livro de programação Python", "Autor B");

        for (int i=0; i<carrinho.length; i++){
            System.out.println(carrinho[i].getDescricao());
        }

    }
}
