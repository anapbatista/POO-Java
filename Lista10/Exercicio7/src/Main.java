public class Main {
    public static void main(String[] args) {

        // Criando o sujeito
        CanalDeNoticias canal = new CanalDeNoticias();

        // Criando os observadores
        Leitor leitor1 = new Leitor("Ana");
        Leitor leitor2 = new Leitor("Paulo");
        Leitor leitor3 = new Leitor("Carlos");

        // Registrando observadores
        canal.adicionarObservador(leitor1);
        canal.adicionarObservador(leitor2);
        canal.adicionarObservador(leitor3);

        // Publicando notícias
        canal.novaNoticia("Saiu o edital do concurso!");
        canal.novaNoticia("Chuva forte prevista para amanhã.");

        // Removendo um observador
        canal.removerObservador(leitor2);

        // Nova notícia depois que Paulo saiu
        canal.novaNoticia("Novo filme em cartaz no cinema.");
    }
}
