public class TimeFutebol implements Comparable<TimeFutebol> {
    private String nome;
    private int pontos;

    public TimeFutebol(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    @Override
    public int compareTo(TimeFutebol outro) {
        // Comparar por pontos (ordem decrescente)
        return Integer.compare(this.pontos, outro.pontos);
    }

    @Override
    public String toString() {
        return nome + " - " + pontos + " pontos";
    }

    public static void main(String[] args) {
        TimeFutebol[] times = {
                new TimeFutebol("Palmeiras", 68),
                new TimeFutebol("Corinthians", 55),
                new TimeFutebol("São Paulo", 60),
                new TimeFutebol("Santos", 50),
                new TimeFutebol("Flamengo", 70),
                new TimeFutebol("Vasco", 45),
                new TimeFutebol("Grêmio", 62),
                new TimeFutebol("Internacional", 58),
                new TimeFutebol("Atlético-MG", 65),
                new TimeFutebol("Cruzeiro", 52)
        };

        System.out.println("Antes da ordenação:");
        for (TimeFutebol t : times) {
            System.out.println(t);
        }

        // Ordenar usando insertionSort genérico
        InsertionSort is = new InsertionSort();
        is.insertionSort(times);

        System.out.println("\nDepois da ordenação (crescente por pontos):");
        for (TimeFutebol t : times) {
            System.out.println(t);
        }
    }

}
