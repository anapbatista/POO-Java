public class Planilha extends Documento {

    private int quantCelulas;

    public Planilha(String titulo, String autor, int tamanhoEmKB, int quantCelulas){
        super(titulo, autor, tamanhoEmKB);
        this.quantCelulas = quantCelulas;
    }

    public boolean abrir(){
        System.out.println("Planilha aberta com sucesso!\n");
        return true;
    }

    public void formatar(){
        System.out.println("Planilha formatada com sucesso!\n");
    }

    public int getQuantCelulas() {
        return quantCelulas;
    }
    


}
