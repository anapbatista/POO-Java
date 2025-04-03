public class Texto extends Documento{

    private int numDePalavras;


    public Texto(String titulo, String autor, int tamanhoEmKB, int numDePalavras){
        super(titulo, autor, tamanhoEmKB);
        this.numDePalavras = numDePalavras;
    }

    

    @Override
    public boolean abrir(){
        System.out.println("Abrindo o texto...\n");
        return true;
    }

    public void formatar(){
        System.out.println("Formatando o texto...\n");
    }



    public int getNumDePalavras() {
        return numDePalavras;
    }



}
