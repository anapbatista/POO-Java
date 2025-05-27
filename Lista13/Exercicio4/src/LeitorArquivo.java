package Lista13.Exercicio4.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo implements Runnable {
    private String arqNome;
    

    public LeitorArquivo(String aArqNome) {
        this.arqNome = aArqNome;
    }

    @Override
    public void run() {
        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(arqNome))) {
            while (br.readLine() != null) {
                total++;
            }
            System.out.println("Arquivo " + arqNome + " tem " + total + " linhas.");
        } catch (IOException e) {
            System.out.println("Erro ao ler " + arqNome);
        }
    }

}
