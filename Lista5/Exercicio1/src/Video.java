// Classe abstrata Video.java
public abstract class Video implements Dispositivo {
    public void ligar() {
        System.out.println("Vídeo ligado");
    }

    public void desligar() {
        System.out.println("Vídeo desligado");
    }

    public int checarStatus() {
        System.out.println("Status do Vídeo verificado");
        return 3;
    }

    // Método abstrato: cada tipo de vídeo calibra de forma diferente
    public abstract void calibrar();
}