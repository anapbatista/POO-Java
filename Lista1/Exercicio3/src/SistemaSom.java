package Lista1.Exercicio3.src;


public class SistemaSom {
    private int volume;

    public SistemaSom(int volume) {
        this.volume = volume;
    }

    public void reproduzirSom(String audio) {
        System.out.println("Reproduzindo som: " + audio);
        System.out.println("Volume em:" + getVolume());
        ajustarFrequencia();
    }

    private void ajustarFrequencia() {
        System.out.println("Ajustando a frequência do áudio para melhor qualidade...");
    }

    public int getVolume(){
        return this.volume;
    }
}


