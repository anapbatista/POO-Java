public abstract class Documento {
    protected String titulo;
    protected String autor;
    protected int tamanhoEmKB;

    public Documento(String titulo, String autor, int tamanhoEmKB) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoEmKB = tamanhoEmKB;
    }

    public abstract boolean abrir();
    public abstract void formatar();

    public String toString() {
        return "Documento {" +
               "Título='" + titulo + '\'' +
               ", Autor='" + autor + '\'' +
               '}';
    }

}
