public class DriverDeVideo extends DriverDispositivo {

    private int brilho;

    public DriverDeVideo(String nome, boolean ligado, int status, int brilho) {
        super(nome, ligado, status);
        if (brilho<=100 && brilho>=0)
        this.brilho = brilho;
        else this.brilho=50;
    }

    public int alteraBrilhoDeExibicao(int aBrilho){
        if (aBrilho<=100 && aBrilho>=0)
        this.brilho = aBrilho;
        else this.brilho=50;
        System.out.println("Nível de brilho fora do intervalo 0 a 100.");
        return this.brilho;
    }

    public int getBrilho() {
        return brilho;
    }

    

    


}
