public class Apresentacao extends Documento {

    private int numSlides;

    public Apresentacao(String titulo, String autor, int tamanhoEmKB, int numSlides){
        super(titulo, autor, tamanhoEmKB);
        this.numSlides = numSlides;
    }

    public boolean abrir(){
        System.out.println("Apresentacao aberta com sucesso!\n");
        return true;
    }

    public void formatar(){
        System.out.println("Apresentacao formatada com sucesso!\n");
    }

    public int getNumSlides() {
        return numSlides;
    }

}
