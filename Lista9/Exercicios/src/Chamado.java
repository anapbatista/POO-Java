package Exercicios.src;

public class Chamado {
    private String descricao;
    private boolean critico;

    public Chamado(String descricao, boolean critico) {
        this.descricao = descricao;
        this.critico = critico;
    }

    public boolean isCritico() {
        return critico;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return (critico ? "[CRÍTICO] " : "[COMUM] ") + descricao;
    }
}

