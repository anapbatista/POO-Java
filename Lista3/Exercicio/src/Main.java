public class Main {
    public static void main(String[] args) {

        Moradia[] vet = new Moradia[4];

        Pessoa p1 = new Pessoa("Luana", 13, 'F');
        Pessoa p2 = new Pessoa("João", 25, 'M');
        Pessoa p3 = new Pessoa("Maria", 75, 'F');
        Pessoa p4 = new Pessoa("Marcos", 34, 'M');

        p1.exibirDados();
        p2.exibirDados();

        p1.aniversario();
        System.out.println(
                p1.getNome() + " , parabéns pelo seu aniversário! Agora, você tem: " + p1.getIdade() + " anos");
        System.out.println(" ");
        p2.aniversario();
        System.out.println(
                p2.getNome() + " , parabéns pelo seu aniversário! Agora, você tem: " + p2.getIdade() + " anos");
        System.out.println(" ");

        p1.exibirDados();
        p2.exibirDados();

        Apartamento apto1 = new Apartamento("Apto", 1, false, 1);
        apto1.setMorador(p1);
        apto1.exibirDadosMoradia();
        vet[0] = apto1;

        Apartamento apto2 = new Apartamento("Apto", 3, true, 3);
        apto2.setMorador(p2);
        apto2.exibirDadosMoradia();
        vet[1] = apto2;

        System.out.println(" ");

        apto1.comprarVagaDeGaragem();
        apto1.exibirDadosMoradia();

        Casa casa1 = new Casa("Casa", 5, true, true);
        Casa casa2 = new Casa("Casa", 1, false, false);
        vet[2] = casa1;
        vet[3] = casa2;
        vet[2].setMorador(p4);
        vet[3].setMorador(p3);

        // exibir moradia´[]
        System.out.println("Exibindo todo o vetor...");
        for (int i = 0; i < vet.length; i++) {
            vet[i].exibirDadosMoradia();
        }
        System.out.println(" ");

        Predio predio1 = new Predio("Royal", 2);
        Apartamento apto01 = new Apartamento("Apto", 2, false, 0);
        predio1.getPredio()[0] = apto01;
        predio1.getPredio()[0].exibirDadosMoradia();

        System.out.println(predio1.getPredio()[0].calculoCustosTotais() );


    }

}
