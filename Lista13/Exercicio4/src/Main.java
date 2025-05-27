package Lista13.Exercicio4.src;

public class Main {
    public static void main(String[] args) {

        // Cria os objetos Runnable
        LeitorArquivo leitor1 = new LeitorArquivo("a.txt");
        LeitorArquivo leitor2 = new LeitorArquivo("b.txt");

        // Cria as threads passando os Runnable
        Thread t1 = new Thread(leitor1);
        Thread t2 = new Thread(leitor2);

        // Inicia as threads
        t1.start();
        t2.start();

        // Espera ambas finalizarem
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida.");
        }

        System.out.println("Leitura dos arquivos finalizada.");
    }

}
