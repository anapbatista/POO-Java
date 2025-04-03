public class TimeFutebol implements Comparavel {

    private String nome;
    private int vitorias;
    private int empates;

    public TimeFutebol(String nome, int vitorias, int empates) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.empates = empates;
    }

    public int getPontos() {
        return (vitorias * 3) + empates;
    }

    @Override
    public int comparaCom(Object outroObjeto) {
        TimeFutebol outroTime = (TimeFutebol) outroObjeto;
        if (this.getPontos() > outroTime.getPontos()) {
            return 1;
        } else if (this.getPontos() < outroTime.getPontos()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return nome + " - Pontos: " + getPontos();
    }

}
